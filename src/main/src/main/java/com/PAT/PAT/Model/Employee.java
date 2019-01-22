package com.PAT.PAT.Model;

import javax.persistence.*;
import javax.validation.constraints.Email;

/**
 * Created by expert on 16/1/19.
 */
@Entity
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;


    @Column(name = "name")
    String name;

    @Column(name ="emailId")
    String emailID;

    @Column(name = "password")
    String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
