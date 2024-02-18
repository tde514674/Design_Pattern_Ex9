public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        IotMediator hub = new IotMediator();
        hub.join(sprinkler);
        hub.join(coffeePot);
        hub.doAlarm();
    }    
}
