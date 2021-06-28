package com.mycompany.mypudingapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/doLogin")
	public String doLogin() {
		return "userLoginPage";
	}
	
	
	@RequestMapping(value = "/DoLogin", method = RequestMethod.POST)
	public String home(HttpServletRequest req, Model model) {
		
		
		
		
		return "result";
	}
	
}
