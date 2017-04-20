package HelloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletClass extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		PrintWriter pr = response.getWriter();
		String msg = "Hello Servlet";
		pr.print("<html><body>");
		pr.print("<h1>"+msg+"</h1>");
		pr.print("</body></html>");
	}
	

}

