package com.ryder.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    String day;
    boolean isFriday;

    @Given("today is Sunday")
    public void today_is_sunday() {
        day = "Sunday";
    }

    @When("I ask is it Friday yet")
    public void i_ask_is_it_friday_yet() {

        if(day == "Friday")
            isFriday = true;
        else
            isFriday = false;
    }

    @Then("I should be told {string}") 
    public void i_should_be_told(String string) {
        System.out.println(string);
    }

    @Given("today is Monday")
    public void today_is_monday() {
        day = "Monday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        day = "Friday"; 
    }
}
