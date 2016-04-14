package com.jeet.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if(studentName.startsWith("Mr")|| studentName.startsWith("Ms")||studentName.startsWith("ms")||studentName.startsWith("mr")){
			setValue(studentName);
		}else{
			studentName = "Ms "+studentName;
			setValue(studentName);
		}
		
	}

}
