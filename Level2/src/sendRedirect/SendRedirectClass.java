package sendRedirect;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/SendRedirectClass"})
public class SendRedirectClass extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
{
	try {
		response.sendRedirect("/index.html");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.err.println("Hata"+e);
	}
}
}
