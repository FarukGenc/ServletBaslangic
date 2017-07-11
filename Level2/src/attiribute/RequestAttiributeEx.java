package attiribute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/RequestAttiributeEx"})
public class RequestAttiributeEx extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		
		PersonPojo p1 = new PersonPojo("Ömer Faruk", "Genç", "5397971497", 20);
		PersonPojo p2 = new PersonPojo("Ali", "Cihan", "5397971497", 21);
		PersonPojo p3 = new PersonPojo("Faruk", "Genç", "5397971497", 24);
	
		List<PersonPojo> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		request.setAttribute("personList", list);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
