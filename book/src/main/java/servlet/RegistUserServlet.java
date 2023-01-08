package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegistLogic;
import model.User;

@WebServlet("/RegistUserServlet")
public class RegistUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls RegistUserServlet doGet()");
		String forward = "/view/registUserForm.jsp";

		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls LoginServlet");

		request.setCharacterEncoding("UTF-8");

		String forward = "/view/registResult.jsp";

		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String command = request.getParameter("command");

		User registUser = new User(userid, password);

		RegistLogic rgc = new RegistLogic();
//※発展：UserDAOに接続してDBへ保存していく
		boolean isRegist = rgc.execute(registUser);

		if(isRegist) {
			HttpSession session = request.getSession();
			session.setAttribute("registUser", registUser);
		}

		System.out.println("userid:" + userid + "\tpass:" + password + "\tcommand：" + command);

		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

}
