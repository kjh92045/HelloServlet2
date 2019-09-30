package ac.kr.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//process: access to database, perform business logic
		
		//build HTML code
		PrintWriter out = response.getWriter();
		
		String htmlPesponse="<html>";
		htmlPesponse+= "<h2>your name is "+username + "</br></h2>";
		htmlPesponse+= "<h2>your password is "+password+"</h2>";
		htmlPesponse+= "</html>";
		
		out.println(htmlPesponse);
	
	}

}
