package com.luv2code.thymeleafDemo.model;

import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    private String firstName;

    // Add validation rules to the last name
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";

    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems;

    // Min max validation ruls for freepasses
    @Min(value = 0, message = "must be greater than or equal to zero..!!")
    @Max(value = 10, message = "must be less than or equal to ten..!!")
    private int freePasses;

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setfavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
