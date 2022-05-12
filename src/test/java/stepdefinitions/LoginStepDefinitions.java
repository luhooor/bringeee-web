package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pageobjects.AuthRegistrationPageObjects;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.Verify;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepDefinitions {
    @Given("{actor} open the website")
    public void visitorOpenTheWebsite(Actor actor) {
        actor.wasAbleTo(NavigateTo.web());
        WaitUntil.the(AuthRegistrationPageObjects.HOMEPAGE, isVisible()).forNoMoreThan(30).seconds();
    }

    @When("{actor} click on {string} element")
    public void visitorClickOnElement(Actor actor, String elementType) throws Exception {
        actor.attemptsTo(
                ClickOn.element(elementType),
                WaitUntil.the(AuthRegistrationPageObjects.MODAL_ELEMENT, isVisible()).forNoMoreThan(30).seconds()
        );
    }

    @And("{actor} input email {string}")
    public void inputEmail(Actor actor, String email) throws Exception {
        actor.attemptsTo(InputText.onField("email", email));
    }

    @And("{actor} input password {string}")
    public void inputPassword(Actor actor, String password) throws Exception {
        actor.attemptsTo(InputText.onField("password",password));
    }

    @And("{actor} click on {string} button")
    public void visitorClickOnButton(Actor actor, String buttonType) throws Exception {
        actor.attemptsTo(ClickOn.button(buttonType));
    }

    @Then("{actor} logged in as {string} and redirected to {string}")
    public void visitorLoggedInAsAndRedirectedTo(Actor actor, String role, String page) throws Exception {
       if(role.equalsIgnoreCase("customer")) {
           actor.attemptsTo(
                   WaitUntil.the(AuthRegistrationPageObjects.BUAT_ORDER_ELEMENT, isVisible()).forNoMoreThan(30).seconds(),
                   Ensure.that(AuthRegistrationPageObjects.BUAT_ORDER_ELEMENT).isDisplayed()
           );
       } else if(role.equalsIgnoreCase("driver")) {
           actor.attemptsTo(
                   WaitUntil.the(AuthRegistrationPageObjects.LIST_ORDER_DRIVER_ELEMENT, isVisible()).forNoMoreThan(30).seconds(),
                   Ensure.that(AuthRegistrationPageObjects.LIST_ORDER_DRIVER_ELEMENT).isDisplayed()
           );
       } else {
           actor.attemptsTo(
                   WaitUntil.the(AuthRegistrationPageObjects.HOME_ADMIN, isVisible()).forNoMoreThan(30).seconds(),
                   Ensure.that(AuthRegistrationPageObjects.HOME_ADMIN).isDisplayed()
           );
       }
    }


    @Then("{actor} should see {string} error message")
    public void visitorShouldSeeErrorMessage(Actor actor, String elementType) throws Exception {
        actor.attemptsTo(Verify.elementDisplayed(elementType));
    }
}
