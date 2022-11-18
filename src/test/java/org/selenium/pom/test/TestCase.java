package org.selenium.pom.test;

import org.junit.jupiter.api.Test;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.object.AddRegistrationForm;
import org.selenium.pom.object.RegistrationForm;
import org.selenium.pom.pages.Elements;
import org.selenium.pom.pages.HomePage;
import org.selenium.pom.utils.JacksonUtils;

import java.io.IOException;

public class TestCase extends BaseTest {

    @Test
    public void Test() throws IOException {
        String searchFor = "Kapo";
        String fullName = "Merjem Kapo";
        String email = "mkapo@gmail.com";
        String currentAddress = "Misija Dobrinja";
        String permanentAddress = "Kobilja Glava";

        Elements elements = new HomePage(driver).
                load().
                clickElements().
                clickTextBoxButton().
                enterTextInFullNameField(fullName).
                enterTextInEmailField(email).
                enterTextInCurrentAddressField(currentAddress).
                enterTextInPermanentAddressField(permanentAddress).
                clickSubmitButton().
                clickRadioButton().
                selectRadioButton().
                clickWebTables().
                clickDeleteWebTables().
                clickEditWebTables();

        RegistrationForm registrationForm = JacksonUtils.deserializeJson("registrationForm.json", RegistrationForm.class);
        AddRegistrationForm addRegistrationForm = JacksonUtils.deserializeJson("addRegistrationForm.json", AddRegistrationForm.class);
        elements.setRegistrationForm(registrationForm).
                clickRegistrationFormSubmit().
                clickAddButton().
                setAddRegistrationForm(addRegistrationForm).
                clickRegistrationFormSubmit().
                search(searchFor);



    }

}
