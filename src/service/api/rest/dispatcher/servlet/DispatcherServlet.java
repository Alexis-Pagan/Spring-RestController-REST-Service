package service.api.rest.dispatcher.servlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import service.api.rest.context.AppContext;

public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppContext.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/rest/*" };
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
}
