package Example;

import java.io.ObjectInputStream;

public class Client {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo");

        //Initially TV is Off
        Off initialState = new Off();

        TV tv = new TV(initialState);

        //First time press
        tv.pressButton();
        //Second time press
        tv.pressButton();

    }
}
