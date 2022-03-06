package co.com.android.certification.app.stepdefinitions;

import co.com.android.certification.app.models.Payment;
import co.com.android.certification.app.models.User;
import co.com.android.certification.app.questions.ValidateStartSession;
import co.com.android.certification.app.utils.Driver;
import co.com.android.certification.app.tasks.InsertCredentials;
import co.com.android.certification.app.tasks.InsertPayment;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.net.MalformedURLException;
import java.util.List;

public class LoginStepDefinition {

    @Before
    public void setUp() throws MalformedURLException {
        //OnStage.setTheStage(new OnlineCast());
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Driver.getDriver())));
        OnStage.theActorCalled("User");
    }

    @Given("^the user is in the mobile app$")
    public void theUserIsInTheMobileApp() {
    }

    @When("^The user enters her credentials$")
    public void theUserEntersHerCredentials(List<User> user) {
        OnStage.theActorInTheSpotlight().attemptsTo(InsertCredentials.login(user));
    }

    @Then("^the user will validate that he started the session$")
    public void theUserWillValidateThatHeStartedTheSession() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateStartSession.validate()));
    }

    @When("^the user wants to make a payment$")
    public void theUserWantsToMakeAPayment(List<Payment> payment) {
        OnStage.theActorInTheSpotlight().attemptsTo(InsertPayment.payment(payment));
    }

    @Then("^the user validates that they can payment$")
    public void theUserValidatesThatTheyCanPayment() {
    }

}