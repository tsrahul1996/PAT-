package com.PAT.PAT.java;

import org.springframework.stereotype.Service;

/**
 * Created by expert on 24/1/19.
 */
@Service
public class LoginService {
    public boolean validateUser(String email, String password) {


        return email.equalsIgnoreCase("rahul9745822638@gmail.com")
                && password.equalsIgnoreCase("aaaa");
    }

}
