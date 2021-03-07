package test_from_torrent;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/Login")
public class Login extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Login()
	{
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		
		if(username.isEmpty() || password.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("Register_3.jsp");
			req.include(request, response);
		}
		
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("Register_4.jsp");
			req.forward(request, response);
		}
	}
}
