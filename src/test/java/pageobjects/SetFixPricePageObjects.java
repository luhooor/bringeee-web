package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class SetFixPricePageObjects extends PageObject {
    public static Target DROPDOWN_ELEMENT =  Target.the("Dropdown element")
            .locatedBy("#btn_profile_inside");
    public static Target LIST_ORDER_ELEMENT = Target.the("List order element in dropdown")
            .locatedBy("#btn_admin_list_order");
    public static Target DISESUAIKAN_TEXT = Target.the("Text mengandung Disesuaikan")
            .locatedBy("//label[contains(text(),'disesuaikan')]");
    public static Target SESUAI_PERKIRAAN_TARIF_TEXT = Target.the("Text sesuai perkiraan tarif")
            .locatedBy("//label[contains(text(),'perkiraan tarif')]");
    public static Target DROPDOWN_MENU = Target.the("Dropdown list menu")
            .locatedBy("//div[@role='menu']");
//    Input
    public static Target TARIF_INPUT = Target.the("Sesuaikan Tarif Input")
        .locatedBy("#emailCos");

//    button
    public static Target ORDER_DETAIL_BUTTON = Target.the("Order Detail Button")
        .locatedBy("tr:nth-child(1) #btn_admin_order_detail");
    public static Target KIRIM_BUTTON = Target.the("Kirim button")
            .locatedBy("#btn_adjust_price");
    public static Target SETUJU_BUTTON = Target.the("Setuju Button")
            .locatedBy("#btn_confirm_price");

}
