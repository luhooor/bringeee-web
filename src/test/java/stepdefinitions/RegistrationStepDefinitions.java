package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pageobjects.AuthRegistrationPageObjects;
import tasks.ClickOn;
import tasks.InputText;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrationStepDefinitions {
    @And("{actor} input all mandatory customer data")
    public void visitorInputAllMandatoryData(Actor actor) throws Exception {
        actor.attemptsTo(
                InputText.onField("reg email","gordon@mail.com"),
                InputText.onField("reg password","gordon"),
                InputText.onField("nama","Jim Gordon"),
                InputText.onField("phone","0812345678910"),
                ClickOn.element("kelamin"),
                InputText.onField("tanggal lahir", "01-01-1990"),
                InputText.onField("alamat", "GCPD"),
                InputText.upload("customer avatar", "src/test/resources/upload/customer_avatar.jpg")
        );
        WaitUntil.the(AuthRegistrationPageObjects.HOMEPAGE, isPresent()).forNoMoreThan(30).seconds();
    }

    @And("{actor} input invalid data with condition: {string}")
    public void visitorInputInvalidDataWithCondition(Actor actor, String condition) throws Exception {
        switch (condition){
            case "without_all_input":
                actor.attemptsTo(
                        InputText.onField("reg email",""),
                        InputText.onField("reg password",""),
                        InputText.onField("nama",""),
                        InputText.onField("phone",""),
                        InputText.onField("tanggal lahir", ""),
                        InputText.onField("alamat", "")
                );
                break;
            case "without_one_input":
                actor.attemptsTo(
                        InputText.onField("reg email","barbaras@mail.com"),
                        InputText.onField("reg password","barbaras"),
                        InputText.onField("phone","0812345678910"),
                        ClickOn.element("kelamin"),
                        InputText.onField("tanggal lahir", "01-01-1990"),
                        InputText.onField("alamat", "Barbara Allen's Residence"),
                        InputText.upload("customer avatar", "src/test/resources/upload/customer_avatar.jpg")
                );
                break;
            case "with_registered_email":
                actor.attemptsTo(
                        InputText.onField("reg email","nasrul@gmail.com"),
                        InputText.onField("reg password","johny"),
                        InputText.onField("nama","Johny Doe"),
                        InputText.onField("phone","0812345678910"),
                        ClickOn.element("kelamin"),
                        InputText.onField("tanggal lahir", "01-01-1990"),
                        InputText.onField("alamat", "Rumah Johny"),
                        InputText.upload("customer avatar", "src/test/resources/upload/customer_avatar.jpg")
                );
                break;
            default:
                throw new Exception("no condition exist: "+condition);
        }

        WaitUntil.the(AuthRegistrationPageObjects.HOMEPAGE, isPresent()).forNoMoreThan(30).seconds();
    }

    @And("{actor} input all mandatory driver data")
    public void visitorInputAllMandatoryDriverData(Actor actor) throws Exception {
        actor.attemptsTo(
                InputText.onField("email driver","thomas@mail.com"),
                InputText.onField("password driver", "thomas"),
                InputText.onField("nama", "Barry Allen"),
                InputText.onField("phone","012345678901"),
                ClickOn.element("kelamin"),
                InputText.onField("tanggal lahir","01-01-1990"),
                InputText.onField("umur driver", "40"),
                InputText.onField("alamat driver","Rumah"),
                InputText.upload("avatar driver", "src/test/resources/upload/driver_avatar.jpg"),
                InputText.onField("nik","1234567890123456"),
                InputText.upload("ktp","src/test/resources/upload/ktp_dummy.jpg"),
                InputText.upload("sim","src/test/resources/upload/sim_dummy.jpg"),
                InputText.upload("stnk","src/test/resources/upload/stnk_dummy.jpg"),
                InputText.upload("truck","src/test/resources/upload/truck_dummy.png"),
                SelectFromOptions.byValue("1").from(AuthRegistrationPageObjects.JENIS_KENDARAAN),
                InputText.onField("plat","B 123 BISA")
        );
    }

    @And("{actor} input invalid data driver with condition: {string}")
    public void visitorInputInvalidDataDriverWithCondition(Actor actor, String condition) throws Exception {

        switch (condition) {
            case "without_all_input":
                actor.attemptsTo(Click.on(AuthRegistrationPageObjects.DRIVER_EMAIL));
                break;
            case "without_one_input":
                actor.attemptsTo(
                        InputText.onField("email driver","barry@mail.com"),
                        InputText.onField("password driver", "barry"),
                        InputText.onField("phone","012345678901"),
                        ClickOn.element("kelamin"),
                        InputText.onField("tanggal lahir","01-01-1990"),
                        InputText.onField("umur driver", "40"),
                        InputText.onField("alamat driver","Star City"),
                        InputText.upload("avatar driver", "src/test/resources/upload/driver_avatar.jpg"),
                        InputText.onField("nik","1234567890123456"),
                        InputText.upload("ktp","src/test/resources/upload/ktp_dummy.jpg"),
                        InputText.upload("sim","src/test/resources/upload/sim_dummy.jpg"),
                        InputText.upload("stnk","src/test/resources/upload/stnk_dummy.jpg"),
                        InputText.upload("truck","src/test/resources/upload/truck_dummy.png"),
                        SelectFromOptions.byValue("1").from(AuthRegistrationPageObjects.JENIS_KENDARAAN),
                        InputText.onField("plat","123123")
                );
                break;
            case "with_registered_email":
                actor.attemptsTo(
                        InputText.onField("email driver","feri@mail.com"),
                        InputText.onField("password driver", "alan"),
                        InputText.onField("nama", "Alan Trucker"),
                        InputText.onField("phone","012345678901"),
                        ClickOn.element("kelamin"),
                        InputText.onField("tanggal lahir","01-01-1990"),
                        InputText.onField("umur driver", "40"),
                        InputText.onField("alamat driver","Kediaman Alan"),
                        InputText.upload("avatar driver", "src/test/resources/upload/driver_avatar.jpg"),
                        InputText.onField("nik","1234567890123456"),
                        InputText.upload("ktp","src/test/resources/upload/ktp_dummy.jpg"),
                        InputText.upload("sim","src/test/resources/upload/sim_dummy.jpg"),
                        InputText.upload("stnk","src/test/resources/upload/stnk_dummy.jpg"),
                        InputText.upload("truck","src/test/resources/upload/truck_dummy.png"),
                        SelectFromOptions.byValue("1").from(AuthRegistrationPageObjects.JENIS_KENDARAAN),
                        InputText.onField("plat","123123")
                );
                break;
            default:
                throw new Exception("no such condition: "+condition);
        }

    }

    @Then("{actor} should see success message")
    public void visitorShouldSeeSuccessMessage(Actor actor) {
        WaitUntil.the(AuthRegistrationPageObjects.NOTIFIKASI, isVisible()).forNoMoreThan(30).seconds();
        actor.attemptsTo(
                Ensure.that(AuthRegistrationPageObjects.NOTIFIKASI).text().containsIgnoringCase("Tunggu konfirmasi driver")
        );
    }
}
