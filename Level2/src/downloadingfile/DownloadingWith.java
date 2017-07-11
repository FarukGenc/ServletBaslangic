package downloadingfile;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadingWith")
public class DownloadingWith extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DownloadingWith() {
        super();
        

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/vnd.oasis.opendocument.text");
		response.setHeader("Content-Disposition", "attachment;filename=odtdosyasi.odt");
		
		InputStream is = getServletContext().getResourceAsStream("/metin.odt");
		int read = 0;
		
		byte [] bytes = new byte[1024];
		ServletOutputStream so = response.getOutputStream();
		while((read = is.read(bytes)) != -1){
			so.write(bytes, 0, read);
		}
		so.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
