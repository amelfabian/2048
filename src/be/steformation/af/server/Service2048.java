package be.steformation.af.server;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;


@SuppressWarnings("serial")
@WebServlet(urlPatterns="/json/service")
public class Service2048 extends HttpServlet {
	private ObjectMapper mapper;
	
	@Override
	public void init(ServletConfig config ) throws ServletException{
		System.out.println("Service2048.init()");
		super.init(config);
		this.mapper = new com.fasterxml.jackson.databind.ObjectMapper();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("Service2048.doPost()");
		
	}
}
