package listener;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HttpSessionBindingListenerTest")
public class HttpSessionBindingListenerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HttpSessionBindingListenerTest() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		HttpSessionBindingListenerEx bindingListenerEx = new HttpSessionBindingListenerEx();
		session.setAttribute("Binding attiribute", bindingListenerEx);
		session.removeAttribute("Binding attiribute..");
	}

}
