package Logic;

import dao.UserDAO;
import model.User;

public class LogicLogin {
	public boolean execute(User user) {
		UserDAO dao = new UserDAO();
		String registPass = dao.findUser(user.getUserid());
		
		if(user.getPassword().equals(registPass)) {
			System.out.println("pass:" + user.getPassword());
			
			return true;
		}
		else {
			System.out.println("false pass:" + user.getPassword());
			
			return false;
		}
	}
}
