package web;


public class LoginCommand{



	private String userName;
	/**
	 * get the value of userName
	 * @return the value of userName
	 */
	public String getUserName(){
		return this.userName;
	}
	/**
	 * set a new value to userName
	 * @param userName the new value to be used
	 */
	public void setUserName(String userName) {
		this.userName=userName;
	}

	private String password;
	/**
	 * get the value of password
	 * @return the value of password
	 */
	public String getPassword(){
		return this.password;
	}
	/**
	 * set a new value to password
	 * @param password the new value to be used
	 */
	public void setPassword(String password) {
		this.password=password;
	}



}
