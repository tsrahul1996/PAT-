package com.PAT.PAT.Model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;

/**
 * Created by expert on 16/1/19.
 */
@Entity
@Table(name="employee",uniqueConstraints={@UniqueConstraint(columnNames = {"name"}),@UniqueConstraint(columnNames = {"email"})})
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;


    @Column(name = "name",unique=true ,nullable = false)
    String name;


    @Column(name ="email",unique=true ,nullable = false)
    String email;

    @Column(name = "password")
    String password;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailID) {
        this.email = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
