package test_from_torrent;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerEndpoint;
@WebServlet(urlPatterns = "/homePage")
public class homePage extends HttpServlet
{
	private static final long serialVersionID = 1L;
	//protected void doPost(HttpServletRequest request, HttpServletResponse) throws 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String adresse = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || password.isEmpty() ||adresse.isEmpty() || contact.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("Register_1.jsp");
			req.include(request, response);
		}
		
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("Register_2.jsp");
			req.forward(request, response);
		}
	}
}
