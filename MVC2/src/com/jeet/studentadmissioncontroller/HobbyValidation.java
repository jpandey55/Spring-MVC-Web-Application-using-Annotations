package com.jeet.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidation  implements ConstraintValidator<IsHobby, String> {
	private String listOfValidHobbies;
	
	@Override
	public void initialize(IsHobby isHobby) {
		this.listOfValidHobbies = isHobby.listOfValidHobbies();
	}
	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx){
		if(studentHobby == null){
			return false;
		}
		if(studentHobby.matches(listOfValidHobbies)){
			return true;
		}else
			return false;
	}

	
}
