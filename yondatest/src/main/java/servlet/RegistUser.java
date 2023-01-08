package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Logic.LogicUserRegist;
import model.User;

@WebServlet("/RegistUser")
public class RegistUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls RegistUser doGet");
		
		String forward = "/view/user/regist/registUserForm.jsp";
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls RegistUser doPost");
		
		request.setCharacterEncoding("UTF-8");
		
		String forward = "/view/user/regist/registUserResult.jsp";
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String command = request.getParameter("command");
		
		System.out.println("ID:" + userid + "\nPASS:" + password + "\nCommand:" + command);
		
		User registUser = new User(userid, password);
		
		System.out.println("userid:" + registUser.getUserid() + "\nPASS:" + registUser.getPassword());

		LogicUserRegist lur = new LogicUserRegist();
		boolean isRegist = lur.execute(registUser);
		
		if(isRegist) {
			HttpSession session = request.getSession();
			session.setAttribute("registUser", registUser);
		}
		
		System.out.println("userid:" + registUser.getUserid() + "\nPASS:" + registUser.getPassword());
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

}
