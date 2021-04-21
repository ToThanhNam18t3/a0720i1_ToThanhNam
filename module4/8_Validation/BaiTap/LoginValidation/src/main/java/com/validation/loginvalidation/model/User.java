package com.validation.loginvalidation.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    int age;

    public User() {
    }

    public User(int id, String firstName, String lastName, String phoneNumber, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz); // Chua hieu
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String userFirstName = user.getFirstName();
        String userLastName = user.getLastName();
        String phoneNumber = user.getPhoneNumber();
        int age = user.getAge();



        ValidationUtils.rejectIfEmpty(errors, "firstName", "userFirstName.empty"); // Neu rong thi bat loi
        ValidationUtils.rejectIfEmpty(errors, "lastName", "userLastName.empty");
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
        ValidationUtils.rejectIfEmpty(errors, "age", "age.empty");

        if (userFirstName.length() > 15 && userFirstName.length() < 5) {
            errors.rejectValue("firstName", "userFirstName.length");
        }
        if(userLastName.length() > 15 && userLastName.length() < 5){
            errors.rejectValue("lastName", "userLastName.length");
        }
        if (!phoneNumber.startsWith("0")) {
            errors.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
        if(age < 18){
            errors.rejectValue("age", "age.young");
        }
    }

}
