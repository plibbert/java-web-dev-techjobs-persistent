package org.launchcode.javawebdevtechjobspersistent.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    private String location;

    public Employer(String location){
        this.location = location;
    }

    public Employer (){

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
