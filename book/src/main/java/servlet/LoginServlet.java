package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls LoginServlet doGet()");

		String forward = "/view/login.jsp";

		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls LoginServlet");

		request.setCharacterEncoding("UTF-8");

		String forward = "/view/loginResult.jsp";

		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String command = request.getParameter("command");

		User loginUser = new User(userid,password);

		LoginLogic lgc = new LoginLogic();
		boolean isLogin = lgc.execute(loginUser);
//発展：UserDAOのメソッドを呼び出し、DB接続、その先からidとパスを引っ張ってきて照合したい
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
		}

		System.out.println("userid:" + userid + "\tpass:" + password + "\tcommand：" + command);

		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

}
