package com.students.controller;

import com.students.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class StudentController {
	
	@RequestMapping(value="/registration",method=RequestMethod.GET)	
	public String showForm(@ModelAttribute("student") Student student, Model model){
		return "registration";
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)	
	public String processForm(@Valid Student student, BindingResult bindingResult,
							  Model model){

		System.out.println(student.toString());

		if (bindingResult.hasErrors()){
			return "registration";
		}

		model.addAttribute("student", student);
		return "success";
	}
	    
}

	

