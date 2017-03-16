package com.marakana.contacts.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marakana.contacts.repositories.ContactRepository;

@WebServlet("/contacts")
public class ContactListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final ContactRepository contactRepository = new ContactRepository();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	//	response.setContentType("text/html");
	//	response.getWriter().println("<html><body><h1>HelloWorld</h1></body></html>");
		
		try {
			request.setAttribute("contacts", contactRepository.findAll());
			RequestDispatcher view = request.getRequestDispatcher("jsp/contactList.jsp");
			view.forward(request, response);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		
	}
}
