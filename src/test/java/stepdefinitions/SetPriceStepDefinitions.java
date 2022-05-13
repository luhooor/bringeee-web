package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pageobjects.AuthRegistrationPageObjects;
import pageobjects.SetFixPricePageObjects;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.Verify;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SetPriceStepDefinitions {
//    @Given("{actor} has logged in as {string}")
//    public void visitorHasLoggedInAs(Actor actor, String role) throws Exception {
//        actor.attemptsTo(NavigateTo.web());
//        WaitUntil.the(AuthRegistrationPageObjects.HOMEPAGE, isVisible()).forNoMoreThan(30).seconds();
//
//        String email;
//        String password;
//
//        switch (role){
//            case "customer":
//                email = "nasrul@gmail.com";
//                password = "nasrul";
//                break;
//            case "driver":
//                email = "feri@mail.com";
//                password = "feri";
//                break;
//            case "admin":
//                email = "admin@gmail.com";
//                password = "admin";
//                break;
//            default:
//                throw new Exception("no such role exist: "+role);
//        }
//
//        actor.attemptsTo(
//                ClickOn.element("masuk"),
//                WaitUntil.the(AuthRegistrationPageObjects.MODAL_ELEMENT, isPresent()).forNoMoreThan(30).seconds(),
//                InputText.onField("email", email),
//                InputText.onField("password", password),
//                ClickOn.button("login")
//        );
//
//
//
//    }

    @And("{actor} click on dropdown menu")
    public void adminClickOnDropdownMenu(Actor actor) throws Exception {
        WaitUntil.the(SetFixPricePageObjects.DROPDOWN_MENU, isVisible()).forNoMoreThan(30).seconds();
        actor.attemptsTo(ClickOn.element("dropdown"));

//        WaitUntil.the(SetFixPricePageObjects.DROPDOWN_MENU, isPresent()).forNoMoreThan(30).seconds();
    }

    @And("{actor} click on {string} link")
    public void adminClickOnLink(Actor actor, String linkType) throws Exception {
        actor.attemptsTo(ClickOn.link("admin list order"));
    }

    @And("{actor} click on a detail in Order Konfirmasi")
    public void adminClickOnADetailInOrderKonfirmasi(Actor actor ) throws Exception {
        actor.attemptsTo(ClickOn.button("admin order detail"));
    }

    @When("{actor} input {string} to {string} input")
    public void adminInputToInput(Actor actor, String value, String inputType) throws Exception {
        actor.attemptsTo(InputText.onField(inputType,value));
    }

    @Then("{actor} can see the order fixed price")
    public void adminCanSeeTheOrderFixedPrice(Actor actor) throws Exception {
        actor.attemptsTo(Verify.elementDisplayed("perubahan tarif"));
    }

    @Then("{actor} can see that the price is still the same")
    public void adminCanSeeThatThePriceIsStillTheSame(Actor actor) throws Exception {
        actor.attemptsTo(Verify.elementDisplayed("perkiraan tarif"));
    }
}
