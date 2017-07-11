package BaslangicResponse;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/response"})
public class BaslangicResponse extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		
		try {
			// bu setCharacterEncoding uff8 ile türkçe karakter problemini çözüyoru.
			response.setCharacterEncoding("utf8");
			
			
			PrintWriter pr = response.getWriter();
			pr.write("ömer faruk genç");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hata");
			
		}
		
	}
	

}
