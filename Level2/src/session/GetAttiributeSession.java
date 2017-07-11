package session;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetAttiributeSession")
public class GetAttiributeSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetAttiributeSession() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		PrintWriter pr = response.getWriter();
		pr.write((String) session.getAttribute("name"));
		pr.write(" Session id : "+request.getSession().getId());
		pr.close();
		
	}


}
