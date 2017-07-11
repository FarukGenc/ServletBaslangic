package listener;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/attiributeListener"})
public class AttiribiteTestListener extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		
		getServletContext().setAttribute("name", "omerfaruk");
		getServletContext().setAttribute("name", "genç");
		getServletContext().removeAttribute("name");
		
	}
	
}
