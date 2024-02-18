import java.util.ArrayList;
import java.util.List;

public class IotMediator {
  private List<Iot> iotList = new ArrayList<>();

  public void join(Iot iot) {
    iotList.add(iot);
    iot.setMediator(this);
  }

  public void doAlarm(){
    System.out.println("Alarm is sending event to all...");
    for (Iot element : iotList){
      element.doTask();
    }
  }

  public void endAlarm(String from) {
    System.out.println("Alarm event ended from " + from);
  }
}
