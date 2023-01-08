package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewRecordServlet")
public class ViewRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calls ViewRecordServlet doGet()");
		//String forward = "/view/viewRecords.jsp";
		String forward = "/view/viewBook.jsp";

		RequestDispatcher d = request.getRequestDispatcher(forward);
		d.forward(request, response);
	}
}