package BaslangicRequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BaslangicRequest extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		
		PrintWriter pr = response.getWriter();
		pr.write("<html><body>");
		pr.write("Girilen isim : " + request.getParameter("firstname") + " ");
		pr.write("</br>");
		pr.write("Girilen soyisim : " + request.getParameter("surname") + " ");
		pr.write("</br>");
		String [] degerler = request.getParameterValues("proLang");
		pr.write("Bildigi diller : ");
		for (int i = 0; i < degerler.length; i++) {
			pr.write(degerler[i] + " ");
		}
		pr.write("</body></html>");
		
	}
	
}
