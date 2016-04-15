package com.jeet.studentadmissioncontroller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsHobby {
	String listOfValidHobbies();
	String message() default "Please provide a valid Hobby" +
			"accepted hobbies are - Music, Football,Cricket and Hockey (Choose anyone)";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default{};

	
	

}
