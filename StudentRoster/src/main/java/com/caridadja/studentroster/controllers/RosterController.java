package com.caridadja.studentroster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caridadja.studentroster.models.Address;
import com.caridadja.studentroster.models.Student;
import com.caridadja.studentroster.services.AddressService;
import com.caridadja.studentroster.services.StudentService;

@Controller
@RequestMapping("/")
public class RosterController {

	private AddressService addressService;
	private StudentService studentService;
	
	public RosterController(AddressService addressService, StudentService studentService) {
		this.addressService = addressService;
		this.studentService = studentService;
	}
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "index.jsp";
	}
	@RequestMapping("students/new")
	public String showNewStudent(@ModelAttribute("student") Student student) {
		return "newStudent.jsp";
	}
	@PostMapping("students/create")
	public String createStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "reditect:/";
	}
	@RequestMapping("contact/new")
	public String showNewContact(Model model, @ModelAttribute("address") Address address) {
		model.addAttribute("students", studentService.getAllStudents());
		return "contactInfo.jsp";
	}
	@PostMapping("contact/create")
	public String createContact(@ModelAttribute("address") Address address) {
		addressService.addAddress(address);
		return "reditect:/";
	}
}
