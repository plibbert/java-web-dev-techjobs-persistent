package org.launchcode.javawebdevtechjobspersistent.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    private String location;

    public Employer(String location) {
        this.location = location;
    }

        @OneToMany
        @JoinColumn
        private List<Job> jobs = new ArrayList<>();

    public Employer (){

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
