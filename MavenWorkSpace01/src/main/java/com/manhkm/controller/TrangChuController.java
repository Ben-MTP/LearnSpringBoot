package com.manhkm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * Tao Spring MVC:
 */
@Controller
public class TrangChuController {
	//Coding something Controller:
	@RequestMapping("/")
	@ResponseBody
	public String viewTrangChu() {
		return "Hello Baby";
	}
	
	public String viewHome() {
		return "Wellcome Home";
			
	}
}
