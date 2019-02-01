package com.PAT.PAT.Controllers;

import com.PAT.PAT.Model.Employee;

import com.PAT.PAT.Service.OrganizationService;
import com.PAT.PAT.Service.UserService;
import com.PAT.PAT.dao.EmployeeRepository;
import com.PAT.PAT.dao.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Created by expert on 16/1/19.
 */
@Controller
@SessionAttributes("email")
public class EmployeeController{

    @Autowired
    UserService userService;

    @Autowired
    private EmployeeRepository employeeRepository;



    @GetMapping("/main")
    public String mainPage(Model model){
        return "main";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model) {
        return "home";

    }

    @RequestMapping(value = "/login")
    public String loginPage(ModelMap model) {


        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String email, @RequestParam String password) {

        Employee userExists = userService.findUserByEmail(email);
       // Employee passwordExist = userService.findUserByPassword(password);

        if(userExists == null) {
            return "login";
        }else{
            return "main";
        }
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String addNewUser(@Valid Employee employee1,@RequestParam String fname, @RequestParam String lname,@RequestParam String email, @RequestParam String password) {
        Employee employee = new Employee();
        employee.setFirstname(fname);
        employee.setLastname(lname);
        employee.setEmail(email);
        employee.setPassword(password);

        userService.saveUser(employee);


        return "organization";

    }





}
