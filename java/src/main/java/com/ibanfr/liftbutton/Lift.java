package com.ibanfr.liftbutton;

public class Lift {
    private String lights;
    private String doors;

    public Lift() {
        lights = "OFF";
        doors = "OPEN";
    }

    public String doors() {
        return doors;
    }

    public void pressButton() {
        lights = "ON";
    }

    public String lights() {
        return lights;
    }
}
