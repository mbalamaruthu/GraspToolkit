package uk.ac.standrews.graspide.grasp.ui.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;

import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.System;

/**
 * Dependency Chain Analysis display using Zest and SWT toolkit.
 *
 */
@SuppressWarnings("deprecation")
public class DependencyChainAnalysis {

    private static final String ANALYSE_SELECTED_ELEMENT = "  Analyse Selected Element  ";
    private static final String SHOW_FLAT_DEPENDENCY_MATRIX = "Open Dtangler Dependency Matrix";
    private static final String SHOW_SCOPED_DEPENDENCY_MATRIX = "Open Dtangler Scoped Dependency Matrix";
    private static final String FLAT_DEPENDENCY_TOOLTIP = "Click to open Dtangler's Dependency Structure Matrix (DSM) UI of components and connectors";
    private static final String SCOPED_DEPENDENCY_TOOLTIP = "Click to open Dtangler's Dependency Structure Matrix (DSM) UI showing dependencies at various levels of composition";
    private static final String GENERATING_DTANGLER_FILE = "Generating Dependencies... Please Wait...";
    private static final String GENERATING_SCOPED_DTANGLER_FILE = "Generating Scoped Dependencies... Please Wait...";
    private Graph dependencyGraph;
    private GraphNode rootNode;
    private LinkProviderPart rootObject;
    private AffectedByAnalysisUtil affectedByAnalysisUtil = new AffectedByAnalysisUtil();
    private AffectsAnalysisUtil affectsAnalysisUtil = new AffectsAnalysisUtil();
    private System architectureSystem;
    private boolean isElementsInArchitecture, isSelectionChanged;
    private String rootName;
    private String selectedNodeText;

    private Shell shell;

    private Color affectsColor = new Color(Display.getCurrent(), 192, 192, 192);;
    private Color affectedBycolor = new Color(Display.getCurrent(), 255, 255,
            255);
    private Color affectedByConnectionColor = new Color(Display.getCurrent(),
            65, 105, 225);
    private Color affectsConnectionColor = new Color(Display.getCurrent(), 160,
            82, 45);
    private Combo elementsComboBox;
    private Button showScopedDependencyButton, showFlatDependencyButton;
    private final DtanglerMatrix dtanglerMatrix;

    public DependencyChainAnalysis(DtanglerMatrix dtanglerMatrix) {
        this.dtanglerMatrix = dtanglerMatrix;
    }

    public DependencyChainAnalysis(IFile file,
            EclipseResourceFileSystemAccess fsa) {
        dtanglerMatrix = new DtanglerMatrix(file, fsa);
    }

    public void displayWindow(final Architecture architecture) {

        final Runnable analysisRunnable = new Runnable() {
            public void run() {

                new DependencyChainAnalysis(dtanglerMatrix)
                        .showMainWindow(architecture);
            }
        };

        Display.getDefault().asyncExec(new Runnable() {

            public void run() {
                BusyIndicator.showWhile(Display.getDefault(), analysisRunnable);
            }

        });
    }

    /**
     * @param architecture
     */
    void showMainWindow(final Architecture architecture) {
        long startTime = java.lang.System.currentTimeMillis();

        architectureSystem = architecture.getArchitecutrebody().getSystem();

        Display d = Display.getDefault();
        Shell shell = createShellForDisplay(d);
        Composite composite = createComposite(shell);

        drawToolBar(composite);
        java.lang.System.out.println("Analysis EndTime After Zest "+java.lang.System.currentTimeMillis());
        shell.open();
        long endTime = java.lang.System.currentTimeMillis();

        startDtanglerDependencyGeneration(architecture);

        java.lang.System.out.println("Analysis Execution Time "+ (endTime-startTime));
    }

    private void startDtanglerDependencyGeneration(
            final Architecture architecture) {
        Runnable generateDependenciesRunnable = new Runnable() {

            public void run() {
                long startTime = java.lang.System.currentTimeMillis();
                dtanglerMatrix
                        .CreateSourceFolderAndGenerateFlatDependencies(architecture);
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        showFlatDependencyButton
                                .setText(SHOW_FLAT_DEPENDENCY_MATRIX);
                        showFlatDependencyButton.setEnabled(true);
                    }
                });
                long endTime = java.lang.System.currentTimeMillis();
                java.lang.System.out.println("Flat Dtangler Generation Time "+ (endTime-startTime));
                dtanglerMatrix.generateScopedDependencies();

                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {

                        showScopedDependencyButton
                                .setText(SHOW_SCOPED_DEPENDENCY_MATRIX);
                        showScopedDependencyButton.setEnabled(true);
                    }
                });
                long endTime2 = java.lang.System.currentTimeMillis();
                java.lang.System.out.println("Scoped Dtangler Generation Time "+ (endTime2-endTime));
            }
        };
        Thread generateDependenciesThread = new Thread(generateDependenciesRunnable);
        generateDependenciesThread.start();
    }

    private Shell createShellForDisplay(Display d) {
        shell = new Shell(d);
        shell.setText("Grasp Dependency Analysis");

        FillLayout fillLayout = new FillLayout();

        shell.setLayout(fillLayout);

        shell.setMaximized(true);
        return shell;
    }

    private Composite createComposite(Shell shell) {
        Composite composite = new Composite(shell, SWT.NONE);

        GridLayout gridLayout = new GridLayout(1, false);
        composite.setLayout(gridLayout);

        GridData gridData = new GridData(GridData.FILL_BOTH);

        composite.setLayoutData(gridData);
        return composite;
    }

    private void initializeDependencyGraph(Composite composite) {
        GridData gridData = new GridData(GridData.FILL_BOTH);

        dependencyGraph = new Graph(composite, SWT.NONE);

        dependencyGraph.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent e) {
                List<?> selectedObjects = ((Graph) e.widget).getSelection();
                if (selectedObjects.size() == 1
                        && selectedObjects.get(0) instanceof GraphNode) {
                    String currentSelectedNode = ((GraphNode) selectedObjects
                            .get(0)).getText();
                    if (!currentSelectedNode.equals(rootName)) {
                        selectedNodeText = currentSelectedNode;
                        isSelectionChanged = true;
                    } else {
                        isSelectionChanged = false;
                    }
                }
            }

        });

        dependencyGraph.setLayoutData(gridData);

    }

    private void drawToolBar(Composite mainComposite) {
        ToolBar toolBar = new ToolBar(mainComposite, SWT.FLAT | SWT.WRAP
                | SWT.LEFT);

        GridData toolBarGridData = new GridData();

        toolBarGridData.horizontalAlignment = SWT.FILL;
        toolBarGridData.verticalAlignment = SWT.FILL;
        toolBarGridData.heightHint = 80;

        toolBarGridData.grabExcessHorizontalSpace = true;

        toolBar.setLayoutData(toolBarGridData);
        toolBar.setLayout(new GridLayout(1, false));

        Composite toolBarComposite = new Composite(toolBar, SWT.NONE);

        toolBarComposite.setLayout(new GridLayout(1, false));

        GridData comboGridData = new GridData();

        comboGridData.horizontalAlignment = SWT.FILL;
        comboGridData.verticalAlignment = SWT.FILL;
        comboGridData.grabExcessHorizontalSpace = true;

        GridData buttonGridData = new GridData();

        buttonGridData.horizontalAlignment = SWT.FILL;
        buttonGridData.verticalAlignment = SWT.FILL;
        buttonGridData.grabExcessHorizontalSpace = true;

        Composite comboComposite = new Composite(toolBarComposite, SWT.NONE);
        comboComposite.setLayout(new GridLayout(2, false));
        comboComposite.setLayoutData(comboGridData);

        Composite buttonComposite = new Composite(toolBarComposite, SWT.NONE);
        buttonComposite.setLayout(new GridLayout(3, false));
        buttonComposite.setLayoutData(buttonGridData);

        initializeDependencyGraph(mainComposite);

        final Label elementsComboBoxLabel = new Label(comboComposite, SWT.NONE);
        elementsComboBoxLabel.setText("Select an Element:");

        elementsComboBox = new Combo(comboComposite, SWT.READ_ONLY);

        addChangeDependencyFocusButton(buttonComposite);
        addShowFlatSpacedDependencyMatrixButton(buttonComposite);
        addShowScopedDependencyMatrixButton(buttonComposite);
        addComboBoxElements(elementsComboBox);
        toolBar.pack();

    }

    private void addShowFlatSpacedDependencyMatrixButton(Composite buttonComposite) {
        showFlatDependencyButton = new Button(buttonComposite, SWT.NONE);
        showFlatDependencyButton.setText(GENERATING_DTANGLER_FILE);
        showFlatDependencyButton.setToolTipText(FLAT_DEPENDENCY_TOOLTIP);
        showFlatDependencyButton.setEnabled(false);
        showFlatDependencyButton.addSelectionListener(new SelectionListener() {

            public void widgetSelected(SelectionEvent event) {
                dtanglerMatrix.showFlatSpacedMatrix(shell);
            }

            public void widgetDefaultSelected(SelectionEvent event) {
            }
        });
    }

    private void addShowScopedDependencyMatrixButton(Composite buttonComposite) {
        showScopedDependencyButton = new Button(buttonComposite, SWT.NONE);
        showScopedDependencyButton.setText(GENERATING_SCOPED_DTANGLER_FILE);
        showScopedDependencyButton.setToolTipText(SCOPED_DEPENDENCY_TOOLTIP);
        showScopedDependencyButton.setEnabled(false);
        showScopedDependencyButton
                .addSelectionListener(new SelectionListener() {

                    public void widgetSelected(SelectionEvent event) {
                        dtanglerMatrix.showScopedMatrix(shell);
                    }

                    public void widgetDefaultSelected(SelectionEvent event) {
                    }
                });
    }

    private void addChangeDependencyFocusButton(Composite buttonComposite) {
        final Button changeCenterElement = new Button(buttonComposite, SWT.NONE);
        changeCenterElement.setText(ANALYSE_SELECTED_ELEMENT);

        changeCenterElement.addSelectionListener(new SelectionListener() {

            public void widgetSelected(SelectionEvent event) {

                if (selectedNodeText == null || !isSelectionChanged) {
                    MessageBox messagebox = new MessageBox(shell,
                            SWT.ICON_INFORMATION);
                    messagebox
                            .setMessage("Select a New Element to Change the Dependency Analyzed Element!!");
                    messagebox.setText("Select Element");
                    messagebox.open();
                } else {

                    isSelectionChanged = false;

                    rootObject = (LinkProviderPart) AnalysisUtil
                            .getElementFromName(selectedNodeText);

                    elementsComboBox.setText(selectedNodeText);

                    clearGraph();

                    drawDependencyGraph();
                }

            }

            public void widgetDefaultSelected(SelectionEvent event) {
            }
        });
    }

    private void addComboBoxElements(final Combo combo) {

        List<EObject> allElements = AnalysisUtil
                .getAllElements(architectureSystem);

        combo.setToolTipText("Select an Element of interest for Dependency Analysis");

        for (EObject element : allElements) {
            combo.add(AnalysisUtil.getElementFullName(element));
        }

        if (allElements.size() <= 0) {
            combo.add("[No Value]");
        } else {
            isElementsInArchitecture = true;
            rootObject = (LinkProviderPart) allElements.get(0);
            drawDependencyGraph();
        }

        combo.select(0);
        combo.addSelectionListener(new SelectionListener() {
            public void widgetSelected(SelectionEvent e) {
                String elementName = combo.getText();
                if (isElementsInArchitecture && !elementName.equals(rootName)) {
                    clearGraph();
                    rootObject = (LinkProviderPart) AnalysisUtil
                            .getElementFromName(elementName);
                    drawDependencyGraph();
                }
            }

            public void widgetDefaultSelected(SelectionEvent e) {
            }
        });

    }

    private void drawDependencyGraph() {
        final String elementFullName = AnalysisUtil
                .getElementFullName(rootObject);
        rootNode = new GraphNode(dependencyGraph, SWT.NONE, elementFullName);
        rootNode.setSize(-1, -1);
        Dimension dimension = rootNode.getSize();

        rootName = elementFullName;

        rootNode.setSize(dimension.width + 20, dimension.height + 50);
        drawAffectedByGraph();
        drawAffectsGraph();
        java.lang.System.out.println("Analysis EndTime Before Zest "+java.lang.System.currentTimeMillis());
        setGraphLayout();
    }

    private void setGraphLayout() {
        final LayoutAlgorithm layoutAlgorithm = new SpringLayoutAlgorithm(
                LayoutStyles.NO_LAYOUT_NODE_RESIZING);
        // HorizontalTreeLayoutAlgorithm();
        // TreeLayoutAlgorithm();
        // SpringLayoutAlgorithm();
        // RadialLayoutAlgorithm();

        dependencyGraph.setLayoutAlgorithm(layoutAlgorithm, true);
    }

    private void drawAffectsGraph() {
        if (rootObject == null || rootNode == null)
            return;

        List<EObject> toBeProcessedObjects = new ArrayList<EObject>();
        toBeProcessedObjects.add(rootObject);
        HashMap<String, GraphNode> graphNodeMap = new HashMap<String, GraphNode>();
        graphNodeMap.put(rootName, rootNode);
        while (!toBeProcessedObjects.isEmpty()) {

            EObject currentObject = toBeProcessedObjects.remove(0);
            List<LinkConsumerExpression> affectedElements = affectsAnalysisUtil
                    .getAffectsElements(currentObject);
            final String elementFullName = AnalysisUtil
                    .getElementFullName(currentObject);
            GraphNode currentNode = graphNodeMap.get(elementFullName);
            List<EObject> nextIteration = drawAffectsAndReturnNextIteration(
                    graphNodeMap, affectedElements, currentNode);
            toBeProcessedObjects.addAll(nextIteration);
        }

    }

    private List<EObject> drawAffectsAndReturnNextIteration(
            HashMap<String, GraphNode> graphNodeMap,
            List<LinkConsumerExpression> affectedElements, GraphNode currentNode) {
        List<EObject> nextIteration = new ArrayList<EObject>();

        for (LinkConsumerExpression element : affectedElements) {

            EObject providerElement = affectsAnalysisUtil
                    .getLastConsumerPartElement(element);
            final String elementFullName = AnalysisUtil
                    .getElementFullName(providerElement);
            GraphNode node = graphNodeMap.get(elementFullName);

            if (node == null) {
                // final String providerFullName =
                // analysisUtil.getProviderFullName(element);
                node = new GraphNode(dependencyGraph, SWT.NONE, elementFullName);
                node.setBackgroundColor(affectsColor);

                node.setSize(-1, -1);

                Dimension dimension = node.getSize();

                node.setSize(dimension.width + 10, dimension.height + 30);

                graphNodeMap.put(elementFullName, node);
                nextIteration.add(providerElement);
            }
            GraphConnection connection = new GraphConnection(dependencyGraph,
                    SWT.NONE, currentNode, node);
            connection.setText("provides");

            IFigure tooltip = new org.eclipse.draw2d.Label(
                    currentNode.getText() + " provides " + node.getText());
            connection.setTooltip(tooltip);

            connection.setConnectionStyle(ZestStyles.CONNECTIONS_DOT
                    | ZestStyles.CONNECTIONS_DIRECTED);
            connection.changeLineColor(affectsConnectionColor);
        }
        return nextIteration;
    }

    private void drawAffectedByGraph() {
        if (rootObject == null || rootNode == null)
            return;
        List<EObject> toBeProcessedObjects = new ArrayList<EObject>();
        toBeProcessedObjects.add(rootObject);
        HashMap<String, GraphNode> graphNodeMap = new HashMap<String, GraphNode>();
        graphNodeMap.put(rootName, rootNode);
        while (!toBeProcessedObjects.isEmpty()) {

            EObject currentObject = toBeProcessedObjects.remove(0);
            List<LinkProviders> affectingElements = affectedByAnalysisUtil
                    .getAffectedBys(currentObject);
            final String elementFullName = AnalysisUtil
                    .getElementFullName(currentObject);
            GraphNode currentNode = graphNodeMap.get(elementFullName);
            List<EObject> nextIteration = drawAffectedBysAndReturnNextIteration(
                    graphNodeMap, affectingElements, currentNode);
            toBeProcessedObjects.addAll(nextIteration);
        }

    }

    private List<EObject> drawAffectedBysAndReturnNextIteration(
            HashMap<String, GraphNode> graphNodeMap,
            List<LinkProviders> affectingElements, GraphNode currentNode) {

        List<EObject> nextIteration = new ArrayList<EObject>();

        for (LinkProviders element : affectingElements) {

            EObject providerElement = affectedByAnalysisUtil
                    .getLastProviderPartElement(element);
            final String elementFullName = AnalysisUtil
                    .getElementFullName(providerElement);
            GraphNode node = graphNodeMap.get(elementFullName);

            if (node == null) {
                // final String providerFullName =
                // analysisUtil.getProviderFullName(element);
                node = new GraphNode(dependencyGraph, SWT.NONE, elementFullName);

                node.setSize(-1, -1);

                Dimension dimension = node.getSize();

                node.setSize(dimension.width + 10, dimension.height + 30);

                node.setBackgroundColor(affectedBycolor);

                graphNodeMap.put(elementFullName, node);
                nextIteration.add(providerElement);
            }
            GraphConnection connection = new GraphConnection(dependencyGraph,
                    SWT.NONE, currentNode, node);
            connection.setText("requires");

            IFigure tooltip = new org.eclipse.draw2d.Label(
                    currentNode.getText() + " requires " + node.getText());
            connection.setTooltip(tooltip);

            connection.setConnectionStyle(ZestStyles.CONNECTIONS_SOLID
                    | ZestStyles.CONNECTIONS_DIRECTED);
            connection.changeLineColor(affectedByConnectionColor);

        }
        return nextIteration;

    }

    private void clearGraph() {

        // remove all connections

        Object[] connections = dependencyGraph.getConnections().toArray();

        for (int index = 0; index < connections.length; index++)
            ((GraphConnection) connections[index]).dispose();

        // remove all nodes

        Object[] nodes = dependencyGraph.getNodes().toArray();

        for (int index = 0; index < nodes.length; index++)
            ((GraphNode) nodes[index]).dispose();
    }

}
