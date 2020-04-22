package com.syntax.class26;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration reg=new Registration();
		reg.setEmail("eclipse@yahoo.com");
		System.out.println(reg.getEmail());
		reg.setuserName("eclipse123");
		System.out.println(reg.getuserName());
		reg.setpassword("zoom123");
		System.out.println(reg.getpassword());
	}

}
