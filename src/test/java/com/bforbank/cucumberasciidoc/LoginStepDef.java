package com.bforbank.cucumberasciidoc;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class LoginStepDef {
    private int num1;
    private int num2;
    private int result;

    @Given("^I have numbers (\\d+) and (\\d+)$")
    public void iHaveNumbersAnd(int arg0, int arg1) {
        num1 = arg0;
        num2 = arg1;
    }

    @When("^I sum the numbers$")
    public void iSumTheNumbers() {
        result = num1 + num2;
    }

    @Then("^I should have (\\d+) as result$")
    public void iShouldHaveAsResult(int arg0) {
        assertEquals("Sum is bad", arg0, result);
    }

    @Given("I have the following numbers")
    public void iHaveTheFollowingNumbers(DataTable data) {
        num1 = Integer.parseInt(data.asLists().get(0).get(0));
        num2 = Integer.parseInt(data.asLists().get(0).get(1));
    }

    @When("I multiply the numbers")
    public void iMultiplyTheNumbers() {
        result = num1 * num2;
    }
}
