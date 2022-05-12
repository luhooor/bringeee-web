package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://bringeee-front-end.vercel.app")
public class AuthRegistrationPageObjects extends PageObject {
//    ELEMENT
    public static Target MODAL_ELEMENT = Target.the("Modal element")
            .locatedBy(".mantine-Paper-root");
    public static Target MASUK_ELEMENT = Target.the("Masuk button")
            .locatedBy("#btn-open-login");
    public static Target DAFTAR_ELEMENT = Target.the("Daftar button")
            .locatedBy("#btn-open-join");
    public static Target DRIVER_TAB_ELEMENT = Target.the("Tab Daftar Driver")
            .locatedBy("//div[text()='Driver']");
    public static Target BUAT_ORDER_ELEMENT = Target.the("Buat Order")
            .locatedBy("//div[text()='Buat Order']");
    public static Target LIST_ORDER_DRIVER_ELEMENT = Target.the("List orderan driver")
            .locatedBy(".Home_konten__HKF-b");
    public static Target HOME_ADMIN = Target.the("Homepage Admin")
            .locatedBy("//div[text()='Semua']");
    public static Target ERROR_MESSAGE = Target.the("Error Message Element")
            .locatedBy(".mantine-Notification-root");
    public static Target REGISTER_ERROR_MESSAGE = Target.the("Error Message Element")
            .locatedBy("//div[contains(@message,'Akun gagal dibuat')]");
    public static Target NOTIFIKASI = Target.the("Message Notification Element")
            .locatedBy(".mantine-Notification-description");
    public static Target HOMEPAGE = Target.the("Homepage")
            .locatedBy(".mantine-Header-root");


//    LOGIN INPUT
    public static Target EMAIL_INPUT = Target.the("Email input field")
        .locatedBy("#input-email-login");

    public static Target PASSWORD_INPUT = Target.the("Password input field")
            .locatedBy("#input-password-login");


//    REGISTER CUSTOMER
    public static Target REGMAIL_INPUT = Target.the("Email field")
            .locatedBy("#emailCos");
    public static Target REGPASS_INPUT = Target.the("Register Password field")
            .locatedBy("#passwordCos");
    public static Target NAMA_INPUT = Target.the("Register Password field")
            .locatedBy("#nama");
    public static Target PHONE_INPUT = Target.the("Register Password field")
            .locatedBy("#phone");
    public static Target KELAMIN_LAKI = Target.the("Use kelamin laki-laki")
            .locatedBy("//input[@value='laki-laki']");
    public static Target TANGGAL_LAHIR_INPUT = Target.the("Input tgl lahir")
            .locatedBy("#dobCos");
    public static Target ALAMAT_INPUT = Target.the("input alamat")
            .locatedBy("#alamatCos");
    public static Target AVATAR_INPUT = Target.the("input avatar")
            .locatedBy("#avatarCos");

//    REGISTER DRIVER
    public static Target DRIVER_EMAIL = Target.the("Email driver element")
            .locatedBy("#emailDriver");
    public static Target DRIVER_PASSWORD = Target.the("Password driver element")
            .locatedBy("#passwordDriver");
    public static Target DRIVER_UMUR = Target.the("Email driver element")
            .locatedBy("#umurDriver");
    public static Target DRIVER_AVATAR_UPLOAD = Target.the("Email driver element")
            .locatedBy("#avatarDriver");
    public static Target NIK_ELEMENT = Target.the("Email driver element")
            .locatedBy("#nik");
    public static Target KTP_UPLOAD = Target.the("Email driver element")
            .locatedBy("#ktp");
    public static Target SIM_UPLOAD = Target.the("Email driver element")
            .locatedBy("#sim");
    public static Target STNK_UPLOAD = Target.the("Email driver element")
            .locatedBy("#stnk");
    public static Target KENDARAAN_UPLOAD = Target.the("Email driver element")
            .locatedBy("#vehiclePict");
    public static Target JENIS_KENDARAAN = Target.the("Jenis Kendaraan dropdown")
            .locatedBy("//select[starts-with(@id,'mantine')]");
    public static Target PLAT_INPUT = Target.the("Input plat nomor")
            .locatedBy("#plat");
    public static Target ALAMAT_DRIVER = Target.the("Input plat nomor")
            .locatedBy("#alamatDriver");



    //      BUTTON
    public static Target LOGIN_BUTTON = Target.the("Login button")
            .locatedBy("#btn-process-login");

    public static Target JOIN_BUTTON = Target.the("Join customer button")
            .locatedBy("//button[contains(@class, 'mantine-iyuujw')]");
}
