package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.object.AddRegistrationForm;
import org.selenium.pom.object.RegistrationForm;

public class Elements extends BasePage {

    public final By fullName = By.id("userName");
    public final By email = By.cssSelector("#userEmail");
    public final By currentAddress = By.cssSelector("#currentAddress");
    public final By permanentAddress = By.cssSelector("#permanentAddress");
    public final By submit = By.cssSelector("#submit");

    public final By textBox = By.cssSelector("div[class='element-list collapse show'] li[id='item-0'] span[class='text']");
    public final By radioButton = By.cssSelector("body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3)");

    public final By selectRadioButton = By.cssSelector("label[for='yesRadio']");
    public final By webTables = By.cssSelector("div[class='element-list collapse show'] li[id='item-3'] span[class='text']");
    public final By deleteWebTables = By.cssSelector("#delete-record-1");
    public final By editWebTables = By.cssSelector("#edit-record-3");
    public final By firstNameField = By.cssSelector("#firstName");
    public final By lastNameField = By.cssSelector("#lastName");
    public final By emailField = By.cssSelector("#userEmail");
    public final By ageField = By.cssSelector("#age");
    public final By salaryField = By.cssSelector("#salary");
    public final By departmentField = By.cssSelector("#department");
    public final By registrationFormSubmit = By.cssSelector("#submit");
    public final By addButton = By.cssSelector("#addNewRecordButton");
    public final By searchField = By.cssSelector("#searchBox");



    public Elements(WebDriver driver) {
        super(driver);
    }

    public Elements clickTextBoxButton(){
        wait.until(ExpectedConditions.elementToBeClickable(textBox)).click();
        return this;
    }

    public Elements enterTextInFullNameField(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(fullName)).sendKeys(txt);

        return this;
    }

    public Elements enterTextInEmailField(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(txt);

        return this;
    }
    public Elements enterTextInCurrentAddressField(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentAddress)).sendKeys(txt);

        return this;
    }
    public Elements enterTextInPermanentAddressField(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(permanentAddress)).sendKeys(txt);

        return this;
    }

    public Elements clickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
        return this;
    }

    public Elements clickRadioButton(){
        wait.until(ExpectedConditions.elementToBeClickable(radioButton)).click();
        return this;
    }

    public Elements selectRadioButton(){
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(selectRadioButton));
        //provjerit cemo da li je radio button vec cekiran
        if(!e.isSelected()){
            e.click(); //ako nije cekiran onda cemo kliknut na njeg
        }
        return this;
    }

    public Elements clickWebTables(){
        wait.until(ExpectedConditions.elementToBeClickable(webTables)).click();
        return this;
    }

    public Elements clickDeleteWebTables(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteWebTables)).click();
        return this;
    }

    public Elements clickEditWebTables(){
        wait.until(ExpectedConditions.elementToBeClickable(editWebTables)).click();
        return this;
    }

    public Elements enterFirstName(String firstName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    public Elements enterLastName(String lastName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    public Elements enterEmail(String email){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    public Elements enterAge(String age){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(ageField));
        e.clear();
        e.sendKeys(age);
        return this;
    }

    public Elements enterSalary(String salary){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(salaryField));
        e.clear();
        e.sendKeys(salary);
        return this;
    }

    public Elements enterDepartment(String department){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(departmentField));
        e.clear();
        e.sendKeys(department);
        return this;
    }

    public Elements setRegistrationForm(RegistrationForm registrationForm){
        return  enterFirstName(registrationForm.getFirstName()).
                enterLastName(registrationForm.getLastName()).
                enterEmail(registrationForm.getEmail()).
                enterAge(registrationForm.getAge()).
                enterSalary(registrationForm.getSalary()).
                enterDepartment(registrationForm.getDepartment());
    }

    public Elements setAddRegistrationForm(AddRegistrationForm addRegistrationForm){
        return  enterFirstName(addRegistrationForm.getFirstName()).
                enterLastName(addRegistrationForm.getLastName()).
                enterEmail(addRegistrationForm.getEmail()).
                enterAge(addRegistrationForm.getAge()).
                enterSalary(addRegistrationForm.getSalary()).
                enterDepartment(addRegistrationForm.getDepartment());
    }

    public Elements clickRegistrationFormSubmit(){
        wait.until(ExpectedConditions.elementToBeClickable(registrationFormSubmit)).click();
        return this;
    }

    public Elements clickAddButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
        return this;
    }

    public Elements enterTextInSearchField(String txt){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField)).sendKeys(txt);

        return this;
    }

    public Elements search(String txt){
        enterTextInSearchField(txt);
        return this;
    }

}
