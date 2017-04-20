package BaslangicRequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="IleriRequest",urlPatterns={"/ileri"})
public class IleriRequest extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		
		PrintWriter pr = response.getWriter();
		pr.write("<html><body>");
		String serverName = request.getServerName();
		String hostHeaderInfo = request.getHeader("host");
		int serverPort = request.getServerPort();
		int localPort = request.getLocalPort();
		int remotePort = request.getRemotePort();
		String method = request.getMethod();
		String contextPath = request.getContextPath();
		String userAgent = request.getHeader("User-Agent");
		
		pr.write("Server name : "+serverName +  	"</br>");
		pr.write("Host name   : "+hostHeaderInfo +  "</br>");
		pr.write("serverPort  : "+serverPort + 		"</br>");
		pr.write("localPort   : "+localPort + 		"</br>");
		pr.write("remotePort  : "+remotePort + 		"</br>");
		pr.write("method      : "+method + 			"</br>");
		pr.write("contextPath : "+contextPath + 	"</br>");
		pr.write("userAgent   : "+userAgent + 	"</br>");
		pr.write("</body></html>");
		
	}
}
