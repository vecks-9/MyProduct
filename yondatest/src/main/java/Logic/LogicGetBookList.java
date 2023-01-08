package Logic;

import java.util.List;

import dao.BookDAO;
import model.Book;

public class LogicGetBookList {
	public List<Book> execute() {
		BookDAO dao = new BookDAO();
		List<Book> bookList = dao.viewBook();
		
		for(Book book : bookList) {
			System.out.println("ID:" + book.getId());
			System.out.println("Title:" + book.getTitle());
			System.out.println("Author:" + book.getAuthor());
			System.out.println("Impression:" + book.getImpression());
		}
		return bookList;
	}
}
