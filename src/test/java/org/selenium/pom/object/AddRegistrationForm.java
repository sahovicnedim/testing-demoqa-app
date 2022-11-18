package org.selenium.pom.object;

public class AddRegistrationForm {
    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;

    public AddRegistrationForm(){}


    public String getFirstName() {
        return firstName;
    }


    public AddRegistrationForm setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }


    public AddRegistrationForm setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }


    public AddRegistrationForm setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAge() {
        return age;
    }


    public AddRegistrationForm setAge(String age) {
        this.age = age;
        return this;
    }

    public String getSalary() {
        return salary;
    }


    public AddRegistrationForm setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public String getDepartment() {
        return department;
    }


    public AddRegistrationForm setDepartment(String department) {
        this.department = department;
        return this;
    }
}
