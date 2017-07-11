package ServletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Notasyon ile birlikte web.xml kullanmadan tanımlamalar.

@WebServlet(name = "ConfigWithNotation", urlPatterns = { "/ConfigWithNotation" }, initParams = {
		@WebInitParam(name = "Username", value = "admin"), @WebInitParam(name = "Password", value = "pass") })
public class ServletConfigClass extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		// Config dosyayı oluşturuldu.
		ServletConfig config = getServletConfig();
		// Ekrana çıktı basmak için PrintWriter sınıfından pr isimli nesne oluşturuldu.
		PrintWriter pr = response.getWriter();
		pr.write("<html><body>");
		pr.write("Username : " + config.getInitParameter("Username"));
		pr.write("</br>");
		pr.write("Password : " + config.getInitParameter("Password"));
		pr.write("</body></html>");
		
		
	}}
	
