package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
@WebServlet(name = "NewServletContext" , urlPatterns = {"/NewServletContext"})
public class NewServletContext extends HttpServlet{
// Txt dosyasını okuyup tarayıcıya bastırmak..
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		// context nesnesi oluşturuyoruz.
		ServletContext context = getServletContext();
		// dosyamızın yolunu belirtiyoruz.
		InputStream txtoku = context.getResourceAsStream("/WEB-INF/faruk.txt");
		
		int content;
		ServletOutputStream servletOutputStream = response.getOutputStream();
		// içindeki değer bitene kadar okuyup basacağını belirleyen döngüye sokuyoruz.
		while((content = txtoku.read()) != -1){
			servletOutputStream.write(content);
		}
	}
	
	
}