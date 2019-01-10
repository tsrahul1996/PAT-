package com.PAT.PAT.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by expert on 10/1/19.
 */
@Controller
public class HomePage {

    @RequestMapping("/")
    public String HomePage(Map<String, Object> model){
        return "HomePage";
    }

}
