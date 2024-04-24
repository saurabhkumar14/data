package com.anhtester.dummy.stepdefinitions;
import com.anhtester.hooks.TestContext;
import com.anhtester.keywords.WebUI;
import com.anhtester.projects.website.cms.pages.CommonPageCMS;
import com.anhtester.projects.website.cms.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dummy {

	 @Given("I want to write a step with precondition")
	    public void iWantToWriteAStepWithPrecondition() {
	        System.out.println("Executing: I want to write a step with precondition");
	    }

	    @Given("some other precondition")
	    public void someOtherPrecondition() {
	        System.out.println("Executing: some other precondition");
	    }

	    @When("I complete action")
	    public void iCompleteAction() {
	        System.out.println("Executing: I complete action");
	    }

	    @When("some other action")
	    public void someOtherAction() {
	        System.out.println("Executing: some other action");
	    }

	    @When("yet another action")
	    public void yetAnotherAction() {
	        System.out.println("Executing: yet another action");
	    }

	    @Then("I validate the outcomes")
	    public void iValidateTheOutcomes() {
	        System.out.println("Executing: I validate the outcomes");
	    }

	    @Then("check more outcomes")
	    public void checkMoreOutcomes() {
	        System.out.println("Executing: check more outcomes");
	    }

	    @Given("I want to write a step with")
	    public void iWantToWriteAStepWithParameter() {
	        System.out.println("Executing: I want to write a step with ");
	    }

	    @When("I check for the in step")
	    public void iCheckForTheValueInStep() {
	        System.out.println("Executing: I check for the in step");
	    }

	    @Then("I verify the in step")
	    public void iVerifyTheStatusInStep() {
	        System.out.println("Executing: I verify the in step");
	    }
	}
