package com.jeet.studentadmissioncontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
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
	//This method will be called after the Spring MVC executes the request handler method for the request
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptorAdapter : Spring MVC"+
			"called postHandler method for "+request.getRequestURI().toString());
	}

	//This method will be called after the response object is produced by the view for the request
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptorAdapter : Spring MVC"+
				"called afterCompletion method for "+request.getRequestURI().toString());
		
	}
	
	

}
