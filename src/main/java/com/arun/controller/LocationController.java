package com.arun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

	@RequestMapping("/createLocation")
	public String createLocation(){
		return "createLocation";
	}
}
