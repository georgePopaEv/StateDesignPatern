package Example;

public class TV {
    private RemoteControl remoteControl;

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public TV(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void pressButton(){
        remoteControl.pressSwitch(this);
    }
}
