package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.UserLogic;
import model.User;

/**
 * @author vecks
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("calls login post");
		
		request.setCharacterEncoding("UTF-8");
		
		String forward = "/view/main.jsp";
		
		String id = request.getParameter("userid");
		String pass = request.getParameter("password");
		
		User loginUser = new User(id, pass);
		
		System.out.println(loginUser.getUserid() + "\t" + loginUser.getPassword());
		
		UserLogic logic = new UserLogic();
		
		boolean isLogin = logic.getLogin(loginUser);
		
		System.out.println(isLogin);
		
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
		}
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}
}