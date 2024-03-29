import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowCookieDetails
 */
@WebServlet("/show-cookie-details")
public class ShowCookieDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCookieDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Fetching cookie from browser with HttpRequest
		Cookie ck[]=request.getCookies();  
	    PrintWriter out = response.getWriter();  
	    

		for(int i=0;i<ck.length;i++){  
		 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
		}  

		
	}

}