package model;

public class UserHandler {
	
	
	User user1 = new User("Guybrush", "Threepwood");
	User user2 = new User("LeChuck", "Pirate");
	
	public boolean checkUserIsValid(String givenUserName, String givenPassWord) {
		if (user1.getUserName().equals(givenUserName)) {
			if (user1.getPassWord().equals(givenPassWord))
			{
				return true;
			}
			return false;
		}
		else if (user2.getUserName().equals(givenUserName)) {
			if (user2.getPassWord().equals(givenPassWord)) {
				return true;
			}
				return false;
		}
		else {
			return false;
		}
	}
	
	public String fetchUserName(String givenUserName) {
		String returnedName = null;
		if (givenUserName.equals(user1.getUserName())) {
			returnedName = user1.getUserName();
		}
		else if (givenUserName.equals(user2.getUserName())) {
			returnedName = user2.getUserName();
		}
		return returnedName;
	}
	
	
	

}
