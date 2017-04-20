package BaslangicResponse;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
@WebServlet(urlPatterns={"/ileriresponse"})
public class IleriResponse extends HttpServlet{
		
	 @Override
	 public void doGet(HttpServletRequest request,HttpServletResponse response){
		 response.setHeader("name", "faruk genç");
		 response.setHeader("name", "ömer faruk genç");
		 
		 boolean isimler = response.containsHeader("name");
		 
		 System.out.println("var mı ? " + isimler);
		 
		 String isim = response.getHeader("name");
		 
		 response.addHeader("name", "ali cihan");
		 response.addHeader("name", "yasin yağcı");
		 
		 Collection<String> nameHeaders = response.getHeaders("name");
		 
		 for(String string : nameHeaders){
			 System.out.println(string);
		 }
		 
		 response.setIntHeader("yas", 20);
		 response.addIntHeader("yil", 1996);
		 
		 response.setDateHeader("today", System.currentTimeMillis());
		 response.addDateHeader("today", 1000000L);
		 
		 Collection<String> headerName = response.getHeaderNames();
		 
		 for(String string : headerName){
			 System.out.println(string);
		 }
		 
	 }

}
