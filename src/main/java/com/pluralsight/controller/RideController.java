package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RideController {

	@RequestMapping(value = "/rides", method = RequestMethod.GET)
	public @ResponseBody List<String> getRides() {
		List <String> rides = new ArrayList<>();
		rides.add("Corner Canyon");
		return rides;
	}
	
}
