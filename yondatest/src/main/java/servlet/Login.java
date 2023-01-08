package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Logic.LogicLogin;
import model.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls Login doGet");
		String forward = "/view/user/login/login.jsp";
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls Login doPost");
		request.setCharacterEncoding("UTF-8");
		
		String forward = "/view/user/login/loginResult.jsp";

		String name = request.getParameter("userid");
		String pass = request.getParameter("password");
		
		User loginUser = new User(name, pass);
		
		System.out.println("動作チェック１" + loginUser.getUserid() + loginUser.getPassword());
		
		LogicLogin lglg = new LogicLogin();
		
		boolean isLogin = lglg.execute(loginUser);
		
		System.out.println("動作チェック２");
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
		}
		
		System.out.println("動作チェック３");
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}
}
