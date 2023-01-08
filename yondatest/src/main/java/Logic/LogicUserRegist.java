package Logic;

import dao.UserDAO;
import model.User;

public class LogicUserRegist {
	public boolean execute(User registUser) {
		UserDAO dao = new UserDAO();
		boolean isRegist = dao.insert(registUser);
		
		if(isRegist) {
			System.out.println("ok\nID:" + registUser.getUserid() 
			+ "\nPASS:" + registUser.getPassword());
			
			return true;
		}
		else {
			System.out.println("No\nID:" + registUser.getUserid()
			+ "\nPASS:" + registUser.getPassword());
			return false;
		}
	}
}
