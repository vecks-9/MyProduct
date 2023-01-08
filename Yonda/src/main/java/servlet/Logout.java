package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls Logout doGet");
		HttpSession session = request.getSession();
		session.invalidate();
		
		String forward = "/view/user/login/logout.jsp";
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}
}
