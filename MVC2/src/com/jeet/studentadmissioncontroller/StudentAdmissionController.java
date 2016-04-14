package com.jeet.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView mav = new ModelAndView("AdmissionForm");
		return mav;
	}
	
	//Spring MVC will make a call to this method first before any other method
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage","Indian Institute of Technology");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="ABC") String name, @RequestParam("studentHobby") String hobby){
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView mav =new  ModelAndView("AdmissionForm");
			return mav;
		}
		ModelAndView mav =new  ModelAndView("AdmissionSuccess");
		return mav;
	}
}
