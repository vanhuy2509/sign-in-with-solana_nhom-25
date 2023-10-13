package com.ps23708.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ps23708.entity.Account;
import com.ps23708.service.AccountService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	AccountService accService;
	
	@RequestMapping("")
	public String home() {
		return "login";
	}
	//=============================================================================================//
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	@PostMapping("checklogin")
	public String checkLogin(ModelMap model,@RequestParam("id")Integer id, @RequestParam("email")String email,@RequestParam("password")String password) {
		if(accService.checklogin(id, email, password)) {
			model.addAttribute("ACCS", accService.findAll());
			return "view-user";
		}else {
			model.addAttribute("ERROR", "Username and password not exist");
			System.out.println("That bai");
		}
		return "login";
	}
	//=============================================================================================//
	@GetMapping("signin")
	public String signin() {
		return "signin";
	}
	@PostMapping("saveorupdate")
	public String saveorupdate(ModelMap model, @ModelAttribute("ACC") Account account) {
		accService.save(account);
		return "signin";
	}
	//=============================================================================================//
	@GetMapping("logout")
	public String logout() {
		return "login";
	}
}