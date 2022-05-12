package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pageobjects.AuthRegistrationPageObjects;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Verify {
    public static Performable elementDisplayed (String elementType) throws Exception {

        WaitUntil.the(AuthRegistrationPageObjects.HOMEPAGE, isPresent()).forNoMoreThan(60).seconds();

        Target element;

        switch (elementType) {

            case "login":
            case "register":
                element = AuthRegistrationPageObjects.ERROR_MESSAGE;
                break;
            default:
                throw new Exception("There is no element type: " + elementType);
        }

        WaitUntil.the(element, isVisible()).forNoMoreThan(60).seconds();

        return Task.where("{0} verify element is displayed",
                Ensure.that(element).isDisplayed()
        );
    }
}
