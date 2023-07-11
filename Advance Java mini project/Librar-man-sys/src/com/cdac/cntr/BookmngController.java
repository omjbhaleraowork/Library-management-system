package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Book_mng;
import com.cdac.dto.Books;
import com.cdac.service.BookmngService;


@Controller
public class BookmngController {
	@Autowired
	private BookmngService bookmngService;
	
	@RequestMapping(value="prep_deatil_add_form.htm", method=RequestMethod.GET)
	public String prepDetailform(ModelMap map) {
		map.put("mng", new Book_mng());
		return "detail_add_form";
		
		}

	@RequestMapping(value = "/detail_add.htm",method = RequestMethod.POST)
	public String detailAdd(Book_mng mng,ModelMap map) {
		
		bookmngService.addDetail(mng);
		return "home";
		
	}
	@RequestMapping(value = "/details_list.htm",method = RequestMethod.GET)
	public String alldetail(ModelMap map,HttpSession session) {

		Book_mng mng = ((Book_mng) session.getAttribute("mng"));
		List<Book_mng> li = bookmngService.selectAll(mng);
		map.put("bookList", li);
		return "detail_list";
	}
	@RequestMapping(value = "/detail_update_form.htm",method = RequestMethod.GET)
	public String DetailUpdateForm(@RequestParam int studentId,ModelMap map) {

		Book_mng bks = bookmngService.findDetail(studentId);
		map.put("mng", bks);
		
		return "detail_update_form";
	}
	@RequestMapping(value = "/detail_update.htm",method = RequestMethod.POST)
	public String booksUpdate(Book_mng mng,ModelMap map,HttpSession session) {
		
		
		bookmngService.modifyBooks(mng);
			
		List<Book_mng> li = bookmngService.selectAll(mng);
		map.put("bookList", li);
		return "detail_list";
	}
	
	
	

}
