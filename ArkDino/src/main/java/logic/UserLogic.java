package logic;

import dao.UserDAO;
import model.User;

public class UserLogic {

	public boolean getLogin(User user) {
		UserDAO dao = new UserDAO();
		String registPass = dao.select(user.getUserid());
		
		if(user.getPassword().equals(registPass)) {
			System.out.println("pass:" + user.getPassword());
			
			return true;
		}
		else {
			System.out.println("");
			
			return false;
		}
	}
}