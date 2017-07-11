package listener;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;

@WebServlet("/TestAttiributeSessionListener")
public class TestAttiributeSessionListener extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestAttiributeSessionListener() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("name", "omer");
		session.setAttribute("name", "faruk");
		session.removeAttribute("name");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
