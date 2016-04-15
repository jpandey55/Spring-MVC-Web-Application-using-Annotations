package com.jeet.studentadmissioncontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar c = Calendar.getInstance();
		int day = c.get(c.DAY_OF_WEEK);
		if(day==1){
			response.getWriter().write("The Website is closed on Sunday"+
		": Please try accessing it on other week days");
		return false;
		}
		else{
			return true;
		}
	}
	

}
