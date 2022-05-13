package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import pageobjects.AuthRegistrationPageObjects;
import pageobjects.SetFixPricePageObjects;

public class ClickOn {

//    klik tipe button
    public static Performable button(String buttonType) throws Exception {
        Target button;

        switch (buttonType) {
            case "login":
                button = AuthRegistrationPageObjects.LOGIN_BUTTON;
                break;
            case "join":
                button = AuthRegistrationPageObjects.JOIN_BUTTON;
                break;
            case "admin order detail":
                button = SetFixPricePageObjects.ORDER_DETAIL_BUTTON;
                break;
            case "Kirim":
                button = SetFixPricePageObjects.KIRIM_BUTTON;
                break;
            case "Setujui":
                button = SetFixPricePageObjects.SETUJU_BUTTON;
                break;

            default:
                throw new Exception("No such button: " +buttonType+" exist");
        }

        return Task.where("{0} click on " +buttonType+" button", Click.on(button));
    }
//    end klik tipe button

//    klik tipe element/tab
    public static Performable element(String elementType) throws Exception {

        Target element;

        switch (elementType) {
            case "masuk":
                element = AuthRegistrationPageObjects.MASUK_ELEMENT;
                break;
            case "daftar":
                element = AuthRegistrationPageObjects.DAFTAR_ELEMENT;
                break;
            case "kelamin":
                element = AuthRegistrationPageObjects.KELAMIN_LAKI;
                break;
            case "driver":
                element = AuthRegistrationPageObjects.DRIVER_TAB_ELEMENT;
                break;
            case "dropdown":
                element = SetFixPricePageObjects.DROPDOWN_MENU;
                break;
            default:
                throw new Exception("No such button: " +elementType+" exist");
        }

        return Task.where("{0} click on " +elementType+" button", Click.on(element));

    }
//    end klik tipe elemen
//    click type link
    public static Performable link(String linkType) throws Exception {
        Target link;
        switch (linkType){
            case "admin list order":
                link = SetFixPricePageObjects.LIST_ORDER_ELEMENT;
                break;

            default:
                throw new Exception("no such link: "+linkType);
        }

        return Task.where("{0} click on "+linkType,
                Click.on(link));
    }

}
