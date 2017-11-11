package com.portfolio.NikkiSperry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/")
    public String index() {
        return "index";
    }
	
	@RequestMapping(value = "/portfolio")
    public String portfolio() {
        return "portfolio";
    }
	
	@RequestMapping(value = "/galleries")
    public String galleries() {
        return "galleries";
    }
	
	@RequestMapping(value = "/contact")
    public String contact() {
        return "contact";
    }
	
	@RequestMapping(value = "/about")
    public String about() {
        return "about";
    }

//    @RequestMapping(value = "/login")
//    public String login() {
//        return "login";
//    }
}
