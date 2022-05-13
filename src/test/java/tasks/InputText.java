package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.actions.UploadToTarget;
import net.serenitybdd.screenplay.targets.Target;
import pageobjects.AuthRegistrationPageObjects;
import pageobjects.SetFixPricePageObjects;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception {
        Target field = null;

        switch (fieldType) {
            case "email":
                field = AuthRegistrationPageObjects.EMAIL_INPUT;
                break;
            case "password":
                field = AuthRegistrationPageObjects.PASSWORD_INPUT;
                break;
            case "reg email":
                field = AuthRegistrationPageObjects.REGMAIL_INPUT;
                break;
            case "reg password":
                field = AuthRegistrationPageObjects.REGPASS_INPUT;
                break;
            case "nama":
                field = AuthRegistrationPageObjects.NAMA_INPUT;
                break;
            case "phone":
                field = AuthRegistrationPageObjects.PHONE_INPUT;
                break;
            case "tanggal lahir":
                field = AuthRegistrationPageObjects.TANGGAL_LAHIR_INPUT;
                break;
            case "alamat":
                field = AuthRegistrationPageObjects.ALAMAT_INPUT;
                break;
            case "email driver":
                field = AuthRegistrationPageObjects.DRIVER_EMAIL;
                break;
            case "password driver":
                field = AuthRegistrationPageObjects.DRIVER_PASSWORD;
                break;
            case "umur driver":
                field = AuthRegistrationPageObjects.DRIVER_UMUR;
                break;
            case "alamat driver":
                field = AuthRegistrationPageObjects.ALAMAT_DRIVER;
                break;
            case "nik":
                field = AuthRegistrationPageObjects.NIK_ELEMENT;
                break;
            case "plat":
                field = AuthRegistrationPageObjects.PLAT_INPUT;
                break;
            case "Sesuaikan tarif":
                field = SetFixPricePageObjects.TARIF_INPUT;
                break;
            default:
                throw new Exception("No "+fieldType+" input exist");
        }

        return Task.where("{0} input: " +value+ " to "+fieldType+ " field", Enter.theValue(value).into(field));

    }

    public static Performable upload(String fieldType, String filepath) throws Exception {
        Target field;

        switch (fieldType) {
            case "customer avatar":
                field = AuthRegistrationPageObjects.AVATAR_INPUT;
                break;
            case "avatar driver":
                field = AuthRegistrationPageObjects.DRIVER_AVATAR_UPLOAD;
                break;
            case "ktp":
                field = AuthRegistrationPageObjects.KTP_UPLOAD;
                break;
            case "sim":
                field = AuthRegistrationPageObjects.SIM_UPLOAD;
                break;
            case "stnk":
                field = AuthRegistrationPageObjects.STNK_UPLOAD;
                break;
            case "truck":
                field = AuthRegistrationPageObjects.KENDARAAN_UPLOAD;
                break;
            default:
                throw new Exception("No "+fieldType+" input exist");
        }

//        return Task.where("{0} upload file", Upload.theFile(file).to(field));
        return Task.where("{0} upload file",
                    Upload.theFile(Paths.get(filepath)).to(field)
                );
    }


}
