package BaslangicResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CookieClass extends HttpServlet {

@Override
public void doGet(HttpServletRequest request,HttpServletResponse response){
	Cookie cookie1 = new Cookie("arkadas1", "ali cihan");
	Cookie cookie2 = new Cookie("arkadas2", "yasin yagci");
	
	cookie2.setMaxAge(30); // tarayıcı içinde 30 saniye yer alacak sonra yok olacak-silecek.
	
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	
	
	// response ile yazdırılır request ile elde edilir.
	
	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for (Cookie c : cookies) {
			System.out.println("Cookie adı : " +c.getName() + " Cookie Değeri : " + c.getValue());
		}
	}
	

}
	
	}
