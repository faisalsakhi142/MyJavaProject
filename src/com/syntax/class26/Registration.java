package com.syntax.class26;

public class Registration {
//	Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class.
//	After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username
//	and password. 
//	Requirements: 
//
//	Valid email consider to be only yahoo
//	Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.

private String email;
private String userName;
private String password;

public void setEmail(String email) {
	if(email.contains("yahoo")) {
		this.email=email;
	}else {
		System.out.println("Email must be of yahoo type");
	}
}
public void setuserName(String userName) {
	if(!userName.isEmpty() && userName.length()>6) {
		this.userName=userName;
	}else {
		System.out.println("UserName cannot be empty and less than 6");
	}
}
public void setpassword(String password) {
	if(!password.contains(userName)) {
		this.password=password;
		System.out.println("Your Registration completed");
	}else {
		System.out.println("Invalid Password");
	}
}
public String getEmail() {
	return email;
}
public String getuserName() {
	return userName;
}
public String getpassword() {
	return password;
}
}
