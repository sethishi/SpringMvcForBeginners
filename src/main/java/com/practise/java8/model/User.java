package com.practise.java8.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by sethishi on 29/01/2016.
 */
public class User {

    @NotEmpty
    private String name;

    @NotEmpty(message = "Please enter your password.")
    @Email(message = "Please enter a valid email.")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
