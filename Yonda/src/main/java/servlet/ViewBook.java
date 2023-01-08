package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Logic.LogicGetBookList;
import model.Book;

@WebServlet("/ViewBook")
public class ViewBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LogicGetBookList lgbl = new LogicGetBookList();
		List<Book> bookList = lgbl.execute();
		
		String forward = "/view/book/viewBook.jsp";
		
		ServletContext application = this.getServletContext();
		application.setAttribute("bookList", bookList);
		
		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}
}
