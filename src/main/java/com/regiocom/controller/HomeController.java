package com.regiocom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome() {
        return "home";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getPrivate() {
        return "private";
    }

    /*
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(ModelMap modelMap) {
        modelMap.addAttribute("message", "Das ist ein Test...");
        return "home";
    }
    */
}
