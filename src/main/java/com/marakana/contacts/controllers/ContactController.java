package com.marakana.contacts.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marakana.contacts.entities.Address;
import com.marakana.contacts.entities.Contact;
import com.marakana.contacts.repositories.ContactRepository;

@Controller
public class ContactController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Autowired
	private  ContactRepository contactRepository;


	/*@RequestMapping(value= "/contacts" , method=RequestMethod.GET)
	public void getContactList(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		request.setAttribute("contacts", contactRepository.findAll());
		RequestDispatcher view = request.getRequestDispatcher("view/contact/list.jsp");
		view.forward(request, response);
	}*/
	
	@RequestMapping(value="/contacts", method=RequestMethod.GET)
	public String getContactList(Model model)
	{
		model.addAttribute("contacts",contactRepository.findAll());
		return "contact/list";
	}
	
 	/*@RequestMapping(value= "/contact" , method=RequestMethod.GET)
	public void getContact(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("add") != null) {
			request.getRequestDispatcher("view/contact/add.jsp").forward(request, response);
		} 
		
		else {
			//get contact id from request parameter, and populate model with
			// the contact and address objects
		long id = Long.parseLong(request.getParameter("id"));
			Contact contact = contactRepository.findOne(id);
			request.setAttribute("contact", contact);
			if(request.getParameter("edit") != null){
				
				request.getRequestDispatcher("view/contact/edit.jsp").forward(request, response);

			}
			
			request.getRequestDispatcher("view/contact/view.jsp").forward(request, response);
		
		}
	}
*/


}