package Logic;

import dao.BookDAO;
import model.Book;

public class LogicBookRegist {
	public boolean execute(Book book) {
		BookDAO dao = new BookDAO();
		boolean isRegist = dao.registBook(book);
		
		if(isRegist) {
			System.out.println("ok\nタイトル：" + book.getTitle()
			+ "\n著者：" + book.getAuthor()
			+ "\n感想：" + book.getImpression());
			return true;
		}
		else {
			return false;
		}
	}
}
