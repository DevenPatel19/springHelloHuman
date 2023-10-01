package com.codingdojo.springhellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String index2(@RequestParam(value="name", required=false) String nameQuery) {
		if(nameQuery == null) {
			return "Hello Human";
		}
		return "Hello " + nameQuery;
	}
}
