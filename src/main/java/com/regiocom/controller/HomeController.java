package com.regiocom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    private final HttpServletRequest request;

    @Autowired
    public HomeController(HttpServletRequest request) {
        this.request = request;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(ModelMap modelMap) {
        modelMap.addAttribute("message", "Das ist die Nachricht aus dem HomeController.");
        return "home";
    }

}
