package com.syntax.class25;

class WebDriverTest{
	public static void main(String[] args) {
		WebDriver obj=new ChromeDriver();
		obj.openBrowser();
		obj.maximizeWindow();
		obj.findElement();
		
		WebDriver obj1=new FirefoxDriver();
		obj1.openBrowser();
		obj1.maximizeWindow();
		obj1.findElement();
		
	}
}