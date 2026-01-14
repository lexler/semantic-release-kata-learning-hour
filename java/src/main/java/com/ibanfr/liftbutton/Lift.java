package com.ibanfr.liftbutton;

public class Lift {
    private String lights;

    public Lift() {
        lights = "OFF";
    }

    public String closed() {
        return "CLOSED";
    }

    public void pressButton() {
        lights = "ON";
    }

    public String lights() {
        return lights;
    }
}
