package Example;

public class TVRemoteBasic {
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction(){
        if (state.equalsIgnoreCase("ON")){
            System.out.println("OFF");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic remote = new TVRemoteBasic();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }
}
