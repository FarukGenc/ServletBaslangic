package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionExample")
public class SessionExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SessionExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pr = response.getWriter();	
		HttpSession session = request.getSession();
		if (session.isNew()) {
			pr.write("Session is new baby !! ");
		}
		else {
			pr.write("Session is old");
		}

	}

}
