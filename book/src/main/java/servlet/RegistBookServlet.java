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
import model.RegistBookLogic;

@WebServlet("/RegistBookServlet")
public class RegistBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls RegistBookServlet doGet()");
		String forward = "/view/registRecordForm.jsp";

		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls LoginServlet");

		request.setCharacterEncoding("UTF-8");

		String forward = "/view/registBookResult.jsp";

		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String impression = request.getParameter("impression");

		Book registBook = null;

		registBook = new Book(title, author, impression);

		RegistBookLogic rBook = new RegistBookLogic();
//※発展：UserDAOに接続してDBへ保存していく
		boolean isRegist = rBook.execute(registBook);

		System.out.println(registBook.getTitle() + ":" + registBook.getAuthor() + ":" + registBook.getImpression());

		if(isRegist) {
			HttpSession session = request.getSession();
			session.setAttribute("registBook", registBook);
		}

		System.out.println("title:" + title + "\tauthor:" + author + "\timpression：" + impression);

		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}

}
