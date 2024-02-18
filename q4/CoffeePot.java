public class CoffeePot extends Iot{

    @Override
    public void doTask() {
        System.out.println("I am coffe pot,... doing my task");
        mediator.endAlarm("Coffee Pot");
    }

}
