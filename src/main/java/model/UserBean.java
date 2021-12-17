package model;

public class UserBean {
private String userData;
	
	UserHandler uh = new UserHandler();

	public String fetchUserData(String givenUserName) {
		String fetchedName = uh.fetchUserName(givenUserName);
		if (fetchedName.equals("Guybrush")) {
			userData = "I'm Guybrush Threepwood, mighty pirate.";
		}
		else if (fetchedName.equals("LeChuck")) {
			userData = "Darn yer riddles, ya saucy female!";
		}
		return userData;
	}
	
	public void setUserData(String givenDataString) {
		userData = givenDataString;
	}
	
	public String getUserInfo() {
		return userData;
	}
}
