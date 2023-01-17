package Example;

abstract class RemoteControl {
    public abstract void pressSwitch(TV context);
}

class On extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On. Going to be Off now");
        context.setRemoteControl(new Off());
    }
}

class Off extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am Off. Going to be on now");
        context.setRemoteControl(new On());
    }
}
