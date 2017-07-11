package session;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// çerezleri kabul etmeyen tarayıcılar için ya da kullanıcılar için nasıl session korunur.

@WebServlet("/UrlRewritting")
public class UrlRewritting extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UrlRewritting() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		session.setAttribute("name", "Ömer Faruk Genç");
		
		PrintWriter pr = response.getWriter();
		String url = "GetAttiributeSession;jsessionid="+request.getSession().getId();
		pr.write("<html><head><title>New UrlRewritting Page</title></head>");
		pr.write("<body>Giris : <a href=\""+url+"\"> Buraya tikla</a>");
		pr.write("</body></html>");
		pr.close();
			
		
		
		
	}

}
