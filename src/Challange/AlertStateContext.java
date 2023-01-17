package Challange;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Vibration();   //default state
    }

    public void setState (MobileAlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert();
    }
}

class Vibration implements  MobileAlertState{

    @Override
    public void alert() {
        System.out.println("Vibration....");
    }
}
class Silent implements  MobileAlertState{

    @Override
    public void alert() {
        System.out.println("Silent....");
    }
}