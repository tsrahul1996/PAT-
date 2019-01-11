package com.PAT.PAT.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by expert on 10/1/19.
 */
@RestController
public class HomePageController {

    @RequestMapping("/homepage")
    public String HomePage(){
        return "HomePageController";
    }

}
