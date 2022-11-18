package org.selenium.pom.object;

public class RegistrationForm {

    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;

    public RegistrationForm(){}


    public String getFirstName() {
        return firstName;
    }


    public RegistrationForm setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }


    public RegistrationForm setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }


    public RegistrationForm setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAge() {
        return age;
    }


    public RegistrationForm setAge(String age) {
        this.age = age;
        return this;
    }

    public String getSalary() {
        return salary;
    }


    public RegistrationForm setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public String getDepartment() {
        return department;
    }


    public RegistrationForm setDepartment(String department) {
        this.department = department;
        return this;
    }

}
