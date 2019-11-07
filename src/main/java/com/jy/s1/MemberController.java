package com.jy.s1;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	//Join -Get
	@RequestMapping(value="memberJoin", method = RequestMethod.GET)
	public void memberJoin() {
		
		
	}
	
	//Join - Post
	@RequestMapping(value="memberJoin", method = RequestMethod.POST)
	public void memberJoin(String id, String phone, String password) {
		System.out.println(id);
		System.out.println(phone);
		System.out.println(password);
	}
	
	

	//Login - GET
	@RequestMapping(value="memberLogin", method = RequestMethod.GET)
	public void memberLogin(String id, String password) {
		System.out.println(id);
		System.out.println(password);
	}
	
	//Login - POST
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
		public void memberLogin() {
			
		}
	

}
