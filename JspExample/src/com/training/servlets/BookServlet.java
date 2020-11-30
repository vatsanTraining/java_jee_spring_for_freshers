package com.training.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Book;
import com.training.services.BookService;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet( "/bookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private BookService service;
	
    public BookServlet() {
        super();
     
        service = new BookService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		List<Book> bookList = service.getAllBooks();
		
		request.setAttribute("bookList", bookList);
		   
		   RequestDispatcher dispatcher = 
				    request.getRequestDispatcher("/showBooks.jsp");
		   
		    dispatcher.forward(request,response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String strBookNumber = request.getParameter("bookNumber");
		     int bookNumber = Integer.parseInt(strBookNumber);
		 
		 String bookName = request.getParameter("bookName");
		 
		 String author = request.getParameter("author");
		 
		 String[] category = request.getParameterValues("category");
		 
		 Book  book = new  Book(bookNumber, bookName, author, category);
	
				   boolean result  = service.addBook(book);
				   
				   String message ="Book Not Added - Check Exceptions";
				   if(result) {
					   message = "One Book Added";
				   }
	
				   request.setAttribute("message", message);
				   
				   RequestDispatcher dispatcher = 
						    request.getRequestDispatcher("/addBook.jsp");
				   
				    dispatcher.forward(request,response);
		 
		 
				 
		
	}

}
