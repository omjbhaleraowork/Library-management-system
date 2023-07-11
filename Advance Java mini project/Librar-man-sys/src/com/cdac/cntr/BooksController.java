package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Books;
import com.cdac.service.BooksService;

@Controller
public class BooksController {
	@Autowired
	private BooksService booksService;
	
	@RequestMapping(value="prep_books_add_form.htm", method=RequestMethod.GET)
	public String prepBookAddform(ModelMap map) {
		map.put("books", new Books());
		return "book_add_form";
		
		}

	@RequestMapping(value = "/book_add.htm",method = RequestMethod.POST)
	public String booksAdd(Books books,ModelMap map) {
		
		booksService.addBooks(books);
		return "home";
		
	}
	@RequestMapping(value = "/book_list.htm",method = RequestMethod.GET)
	public String allbooks(ModelMap map,HttpSession session) {

		Books books = ((Books) session.getAttribute("books"));
		List<Books> li = booksService.selectAll(books);
		map.put("bookList", li);
		return "books_list";
	}
	@RequestMapping(value = "/books_delete.htm",method = RequestMethod.GET)
	public String booksDelete(@RequestParam int bookId,ModelMap map,HttpSession session) {
		//int bookId = ((Books)session.getAttribute("books")).getBookId();
		Books books = ((Books) session.getAttribute("books"));
		booksService.removeBooks(bookId); 
		
		List<Books> li = booksService.selectAll(books);
	
		map.put("bookList", li);
		return "books_list";
	}
	@RequestMapping(value = "/book_update_form.htm",method = RequestMethod.GET)
	public String booksUpdateForm(@RequestParam int bookId,ModelMap map) {

		Books bks = booksService.findBooks(bookId);
		map.put("books", bks);
		
		return "book_update_form";
	}
	@RequestMapping(value = "/book_update.htm",method = RequestMethod.POST)
	public String booksUpdate(Books books,ModelMap map,HttpSession session) {
		
		
		booksService.modifyBooks(books);
			
		List<Books> li = booksService.selectAll(books);
		map.put("bookList", li);
		return "books_list";
	}
	
	
	

}
