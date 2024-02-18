public class Sprinkler extends Iot {

    @Override
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.endAlarm("Sprinkler");
    }
}
