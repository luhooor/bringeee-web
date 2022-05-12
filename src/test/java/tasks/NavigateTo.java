package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pageobjects.AuthRegistrationPageObjects;

public class NavigateTo {
    public static Performable web(){

        return Task.where("{0} access url",
                Open.browserOn().the(AuthRegistrationPageObjects.class));
    }
}
