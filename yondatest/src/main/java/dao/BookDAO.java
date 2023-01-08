package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Book;

public class BookDAO {
	private final String RDB = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost/yonda_db?useSSL=false";
	private final String USER = "root";
	private final String PASS = "root";
	
	public boolean registBook(Book book) {
		//DB接続用オブジェクト
		Connection conn = null;
		//SQL発酵用オブジェクト
		PreparedStatement pstmt = null;
		
		int count = 0;
		
		String sql = "INSERT INTO book_t (title_c, author_c, impression_c) VALUES (?, ?, ?)";
		
		System.out.println("タイトル：" + book.getTitle() + "\n著者：" + book.getAuthor() + "\n感想：" + book.getImpression());
		
		try {
			Class.forName(RDB);
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getImpression());
			
			count = pstmt.executeUpdate();
			
			System.out.println(count + "行を追加");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
					return false;
				}
			}
		}
		if(count == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//表示メソッド
	public List<Book> viewBook() {
		List<Book> bookList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(RDB);
			conn = DriverManager.getConnection(URL, USER, PASS);
			
			//SELECT文を準備
			
			String sql = "SELECT id_c, title_c, author_c, impression_c FROM book_t";
			
			pstmt = conn.prepareStatement(sql);
			//SELECT文を実行し、結果表を取得する
			rs = pstmt.executeQuery();
			
			//SELECTの結果をあるだけリストに格納していく
			while (rs.next()) {
				int id			= rs.getInt("id_c");
				String title	= rs.getString("title_c");
				String author	= rs.getString("author_c");
				String impression = rs.getString("impression_c");
				
				System.out.println("id:" + id);
				System.out.println("title:" + title);
				System.out.println("author:" + author);
				System.out.println("impression:" + impression);
				
				//SELECTの結果1行毎にオブジェクト化してリストに格納
				Book book = new Book(id, title, author, impression);
				bookList.add(book);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return bookList;
	}
}
