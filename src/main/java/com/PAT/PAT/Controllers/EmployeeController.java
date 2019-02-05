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

import javax.servlet.http.HttpServletRequest;
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

        if(email == "") {
            model.addAttribute("message", "Please ! enter an email address");
            return "login";
        }
        if(password == "") {
            model.addAttribute("message", "Please ! enter an password");
            return "login";
        }

        Employee userExists = userService.findUserByEmail(email);
       // Employee passwordExist = userService.findUserByPassword(password);
        if(userExists == null) {
            model.addAttribute("message","The email or password you have entered is incorrect");
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

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String WelcomePage(ModelMap model,@RequestParam String email,@RequestParam String password) {
        String name="working";
        if (email == null && password == null) {
            name = "The email or password you have entered is incorrect";
            model.addAttribute("message", name);
            return "welcome";
        } else{ model.addAttribute("message", name);
        return "welcome";
        }

    }

        @RequestMapping(value = "/welcome", method = RequestMethod.GET)
        public String WelcomePage() {
        return "welcome";
    }


    }

