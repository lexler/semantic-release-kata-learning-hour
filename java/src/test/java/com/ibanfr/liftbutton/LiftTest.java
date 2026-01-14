package com.ibanfr.liftbutton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiftTest {

    //TEST LIST
    //[x] - doors should be CLOSED when Lift is created
    //[X] - should switch lights ON when button is pressed and doors are CLOSED
    //[] - should OPEN the lift doors when lift arrives
    //[] - should switch OFF the lights when lift arrives
    //[] - lights should be OFF when button is pressed and doors are OPEN

    private Lift lift;

    @BeforeEach
    void setUp() {
        lift = new Lift();
    }

    @Test
    @DisplayName("should create a new Lift")
    void should_create_a_new_Lift() {
        assertThat(lift)
            .as("Lift should be created")
            .isNotNull();
    }


    @Test
    @DisplayName("doors should be OPENED when Lift is created")
    void doors_should_be_opened_when_the_lift_is_created() {
        assertThat(lift.doors())
            .as("doors should be open")
            .isEqualTo("OPEN");
    }

    @Test
    @DisplayName("should switch lights ON when button is pressed and doors are CLOSED")
    void buttonPressedLightsOn() {
        lift.pressButton();

        assertThat(lift.lights())
            .as("lights are on")
            .isEqualTo("ON");
    }

    @Test
    @DisplayName("lights off without button press")
    void buttonNotPressedLightsOff() {
        assertThat(lift.lights())
            .as("lights are off")
            .isEqualTo("OFF");
    }
}
