package uk.ac.standrews.graspide.ui.wizards

/**
 * Xtend file containing example grasp file contents.
 */

class ExamplesText {

 def static String getTransactionsText(){
     '''
//
// A simple Grasp architecture specification of a Banking Transactions
// Electronic Fund Transfer
//
architecture Example
{
    // Requirements and quality attribute specifiers
    requirement Rq_AckProcessing;

    quality_attribute MultiConnections = true;
    quality_attribute MaxVolumePerBank = 50;
    quality_attribute MinTrxPerDay = 8000;
    quality_attribute NoLostPayments = true;
    quality_attribute NoDuplicates = true;
    quality_attribute TimeOut = true;

    // Rationale descriptors
    @(desc="OptimalMsgProcPerformance")
    rationale AR10() {
        reason supports MultiConnections, MaxVolumePerBank, MinTrxPerDay;
    }
    @(desc="ProcessingSequence")
    rationale AR13(M) {
        reason supports Rq_AckProcessing;
    }
    @(desc="NoLossTransaction")
    rationale AR14(M) {
        reason supports NoLostPayments, NoDuplicates;
    }
    @(desc="TimeOutMechanism")
    rationale AR15(M) {
        reason supports TimeOut;
    }

    // Templates
    template AsyncComponent() {
        property asyncMarker = "Async";
    }
    template AlarmService() {}

    // Runtime structure
    system PaymentGateway {
        component msgProc = AsyncComponent() because AR10();
        component mcpDriver = AsyncComponent() because AR13(msgProc);
        component errDetect = AsyncComponent() because AR14(msgProc);
        component errRecover = AsyncComponent() because AR14(msgProc);
        component alarm = AlarmService() because AR15(errDetect);
    }
}

     '''

 }
 def static String getRESTText(){
     '''
//
// A simple Grasp architecture specification of a REST Style
//
architecture testConstructs
{
   //quality_attribute supportMultipleClients;
    rationale R1()
    {
        reason #'Use REST Style';
    }

    rationale R2()
    {
        reason #'Use Layered Style';
    }

    rationale R3()
    {
       reason #'Configurable Server and Database';
       reason #'Low Coupling between Server and Database';
    }

    rationale R4()
    {
        reason #'Singleton Pattern';
        //reason supports supportMultipleClients;
    }

    template ConfigurationComponent(){
        provides IConfiguration;
    }

    template ViewComponent() {
        provides IView;
        requires IServerConnector;
    }

    template ServerConnector() {
        provides IServerConnector;
        requires IServerURIs;
    }

    template RestServerComponent() {
        provides IServerURIs;
    }

    template ServerComponent() extends RestServerComponent {
        requires IConfiguration;
        requires IDatabase;
        //check IDatabase->maxInstances = 1;
     }

     template StorageComponent()  {
        requires IConfiguration;
        provides IDatabase;
        //property maxInstances = 1 because R4();
    }

    system testConstructsSystem
    {

        layer Database because R2()
        {
         component databaseConfiguration = ConfigurationComponent()  because R3();
         component storageComponent = StorageComponent() because R3();
         link storageComponent.IConfiguration to databaseConfiguration.IConfiguration;
        }

        layer Server over Database because R2()
        {
            component serverComponent = ServerComponent() because R3(), R1();
            component serverConfiguration = ConfigurationComponent()  because R3();

            link serverComponent.IConfiguration to serverConfiguration.IConfiguration;
        }


        layer Client over Server because R2()
        {
         component viewComponent = ViewComponent() because R1();

         connector serverConnector = ServerConnector() because R1();

         link viewComponent.IServerConnector to serverConnector.IServerConnector;
        }


        link Server.serverComponent.IDatabase to Database.storageComponent.IDatabase;
        link Client.serverConnector.IServerURIs to Server.serverComponent.IServerURIs;

    }
}

     '''

 }
    def static String getWsnSimulatorText(){
        '''
//
// A simple Grasp architecture specification of a WSN simulator
//
architecture WsnSimulator
{
    // Rationale descriptors
    rationale R1() {
        reason #'Use layered architecture style';
        reason #'Achieve clear seperation of concerns';
    }
    rationale R2() {
        reason #'Use MVC design pattern';
    }
    rationale R3() {
        reason #'Simulator engine must perform event logging';
    }

    // Templates
    template ViewComponent() {
        provides IView;
        requires IModel;
    }
    template ControllerComponent() {
        requires IView;
        requires IModel;
    }
    template ModelComponent() {
        provides IModel;
        requires ISequencer;
        requires INetwork;
    }
    template SensorNetworkComponent() {
        provides INetwork;
        requires ISequencer;
        requires ILogger;
    }
    template SequencerComponent() {
        provides ISequencer;
        requires ILogger;
    }
    template LoggerComponent() {
        provides ILogger;
//      check isConnected();
    }

    // Runtime static model
//  @Visualiser(Canvas = [1000,1000])
    system StaticModel
    {
        layer UtilityLayer because R1()
        {
            component logger = LoggerComponent();
        }

        layer SimulatorLayer over UtilityLayer because R1()
        {
            component network = SensorNetworkComponent();
            component sequencer = SequencerComponent();
            link network.ISequencer to sequencer.ISequencer;
        }

        layer PresentationLayer over SimulatorLayer, UtilityLayer because R1()
        {
            component model = ModelComponent() because R2();
            component controller = ControllerComponent() because R2();
            component textView = ViewComponent() because R2();
            component graphicView = ViewComponent() because R2();

            link controller.IModel to model.IModel;
            link textView.IModel to model.IModel;
            link graphicView.IModel to model.IModel;
            link controller.IView to textView.IView;
            link controller.IView to graphicView.IView;
        }

        link PresentationLayer.model.INetwork to SimulatorLayer.network.INetwork;
        link PresentationLayer.model.ISequencer to SimulatorLayer.sequencer.ISequencer;
        link SimulatorLayer.network.ILogger to UtilityLayer.logger.ILogger because R3();
        link SimulatorLayer.sequencer.ILogger to UtilityLayer.logger.ILogger because R3();
    }
}
        '''

    }

}
