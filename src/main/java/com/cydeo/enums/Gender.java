

package com.cydeo.enums;

public enum Gender {

    MALE("Male"),FEMALE("Female");

    //STATUS("IN PROGRESS")

    //they can do 0 and 1 for male and female

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}