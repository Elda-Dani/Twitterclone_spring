package com.nestdigital.TwitterClone.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class TwitterModel {
   @Id
   @GeneratedValue

    private int id;
    private String name;
    private String dob;
    private String phoneNo;
    private String place;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TwitterModel() {
    }

    public TwitterModel(int id, String name, String dob, String phoneNo, String place, String email, String password) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.place = place;
        this.email = email;
        this.password = password;
    }
}
