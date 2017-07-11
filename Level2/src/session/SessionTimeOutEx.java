package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTimeOutEx")
public class SessionTimeOutEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SessionTimeOutEx() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer accessCount =(Integer) session.getAttribute("accessCount");
		if (accessCount == null) {
			accessCount = 1 ;
		}
		else {
			accessCount ++;
		}
		
		session.setAttribute("accessCount", accessCount);
		String id = session.getId();
		// Ne zaman oluşturulduğunu bize geri dönderir.
		Date creationTime = new Date(session.getCreationTime());
		// En son ne zaman erişildi bu session'a .
		Date accessTime = new Date(session.getLastAccessedTime());
		// session ne zaman kapansın yani ne kadar süre hayatta kalsın ?
		// tomcat normal süresi 1800 saniye
		int maxInterval = session.getMaxInactiveInterval();
		// -2 felan verirsek sınırsız süre hayatta
		// 20 saniye hayatta
		session.setMaxInactiveInterval(20);
		// update oldu
		int updateMaxInterval = session.getMaxInactiveInterval();
		session.setAttribute("name", "Ömer Faruk Genç");
		PrintWriter pr = response.getWriter();
		pr.println("AccessCount : "+accessCount);
		pr.println("Session id : " + id);
		pr.println("Creation Time : " + creationTime);
		pr.println("Last Access Time : " + accessTime);
		pr.println("Default maxInterval : " +maxInterval);
		pr.println("Update maxInactiveInterval : " +updateMaxInterval);
		pr.close();
		
		
		


		
	}

}
