package com.vtiger.stepdefinitions;

import io.cucumber.java.en.When;

public class Accountsteps extends BaseSteps
{
    @When("user enter the mandatories fields on account and click on save button")
    public void createAccount()
    {
        getAccountPage().ClickNewAccount();
        getAccountPage().createAccount(td.get(ScenarioName).get("AccountName"));
    }
}

