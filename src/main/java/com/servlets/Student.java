package com.servlets;

public class Student {
	
	
	
	


	private String name ;
	private String password;
	private String email;
	private int phoneno;
	
	
	public Student(String name, String password, String email, int phoneno) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the phoneno
	 */
	public int getPhoneno() {
		return phoneno;
	}


	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", password=" + password + ", email=" + email + ", phoneno=" + phoneno + "]";
	}
	
	

	
	
	
	
	

}
