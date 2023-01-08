package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Book;
import model.User;

@WebServlet("/RegistBook")
public class RegistBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls RegistBook doGet");
		
		String forward = "/view/book/registBookForm.jsp";
		
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("loginUser");
		
		if(loginUser != null) {
			RequestDispatcher d = request.getRequestDispatcher(forward);
			d.forward(request, response);
		}
		else {
			response.sendRedirect("/Yonda/Top");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls RegistBook doPost");
		
		request.setCharacterEncoding("UTF-8");
		
		String forward = "/view/book/registBookResult.jsp";
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String impression = request.getParameter("impression");
		
		Book registBook = new Book(title, author, impression);
//		LogicBookRegist lbr = new LogicBookRegist();
		
	//	boolean isRegist = lbr.execute(registBook);
		
		if(true) {
			HttpSession session = request.getSession();
			session.setAttribute("registBook", registBook);
		}

		System.out.println("オブジェクト\nタイトル：" + registBook.getTitle() + ":" + registBook.getAuthor() + ":" + registBook.getImpression());
		System.out.println("変数\nタイトル：" + title + "\n著者：" + author + "\n感想：" + impression);
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}
}
