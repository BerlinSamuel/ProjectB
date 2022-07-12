package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Service {
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "<h1>Welcome</h1>";
	}
	@RequestMapping("/home")
	public String homePage() {
		String html="<div>Earth's atmosphere consists mostly of nitrogen and oxygen. More solar energy is received by tropical regions than polar regions and is redistributed by atmospheric and ocean circulation. Water vapor is widely present in the atmosphere and forms clouds that cover most of the planet.</div>";
		return html;
	}
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue="madurai")String city) {
		return "<h1>Welcome to "+city+" </h1>";
		
	}
}
