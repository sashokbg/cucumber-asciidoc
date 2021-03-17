package com.bforbank.cucumberasciidoc;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @Given("^I have numbers (\\d+) and (\\d+)$")
    public void iHaveNumbersAnd(int arg0, int arg1) {
    }

    @When("^I sum the numbers$")
    public void iSumTheNumbers() {
    }

    @Then("^I should have (\\d+) as result$")
    public void iShouldHaveAsResult(int arg0) {
    }

    @Given("I have the following numbers")
    public void iHaveTheFollowingNumbers(DataTable data) {

    }
}
