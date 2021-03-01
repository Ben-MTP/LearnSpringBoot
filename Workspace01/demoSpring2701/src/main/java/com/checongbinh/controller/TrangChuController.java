package com.checongbinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TrangChuController {	
	@RequestMapping(path = "/", method=RequestMethod.GET)
	public ModelAndView viewTrangChu() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("trangchu");
		return modelAndView;
	}
	
	/*
	 * Method GetChiTiet -> call method GET
	 */
	@RequestMapping(path = "/chitiet/{id}", method=RequestMethod.GET)
	public String GetChiTiet(@PathVariable int id,@MatrixVariable String tensp ,@MatrixVariable String ngaysx, ModelMap modelMap) {
		modelMap.addAttribute("id", id);
		modelMap.addAttribute("tensp", tensp);
		modelMap.addAttribute("ngaysx", ngaysx);
		return "chitiet";
	}
	
	/*
	 * Method PostChiTiet -> call method POST
	 */
	
	@RequestMapping(path = "/chitiet", method=RequestMethod.POST)
	public String PostChiTiet(@RequestParam String hoten, ModelMap modelMap) {
		modelMap.addAttribute("name", hoten);
		
		return "chitiet";
	}
	
}
