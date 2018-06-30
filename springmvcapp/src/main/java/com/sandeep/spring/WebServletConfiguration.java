package com.sandeep.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		//applicationContext.setConfigLocation("");
		applicationContext.register(SpringConfig.class);
		applicationContext.setServletContext(ctx);
		ServletRegistration.Dynamic servlet = ctx.
				addServlet("dispatcher", new DispatcherServlet(applicationContext));
		//servlet.addMapping("/");
		System.out.println("------------------------------------djdjjdjdjs");
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
