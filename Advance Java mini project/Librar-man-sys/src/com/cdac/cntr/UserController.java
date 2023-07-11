package com.cdac.cntr;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Books;
import com.cdac.dto.User;
import com.cdac.service.UserService;
import com.cdac.valid.UserValidation;


@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidation userValidation;
	@RequestMapping(value="prep_reg_form1.htm",method=RequestMethod.GET)
	public String prepRegform(ModelMap map) {
		
		map.put("user",new User());
		return "reg_form1";
		
		
	}
	@RequestMapping(value = "/reg1.htm",method = RequestMethod.POST)
	public String register(User user,BindingResult result,ModelMap map)
	{
		userValidation.validate(user, result);
		if(result.hasErrors()) {
			return "reg_form1";
		}
		userService.addUser(user);
		return "user";
	}
	@RequestMapping(value = "/prep_log_form1.htm",method = RequestMethod.GET)
	public String prepLogForm(ModelMap map) {
		map.put("user", new User());
		return "log_form1";
	}
	
	@RequestMapping(value = "/login1.htm",method = RequestMethod.POST)
	public String login(User user,BindingResult result,ModelMap map,HttpSession session) {
		
		
		userValidation.validate(user, result);
		if(result.hasErrors()) {
			return "log_form1";
		}
		boolean b = userService.findUser(user);
		if(b) {
			session.setAttribute("user", user);
			return "user_home";
		}else {
			map.put("user", new User());
			return "log_form1";
		}
	}
	@RequestMapping(value = "/book_list_user.htm",method = RequestMethod.GET)
	public String allbooks(ModelMap map,HttpSession session) {

		Books books = ((Books) session.getAttribute("books"));
		List<Books> li = userService.selectAll(books);
		map.put("bookList", li);
		return "books_list_user";
	}
}
