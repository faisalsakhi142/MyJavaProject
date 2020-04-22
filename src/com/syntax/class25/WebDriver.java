package com.syntax.class25;

public interface WebDriver {
//	Create a WebDriver Interface that will have the following unimplemented behaviour:
//		openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes
//		that implements WebDriver interface: ChromeDriver and FirefoxDriver.
void openBrowser();
void maximizeWindow();
void findElement();


}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome can open Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize Window");
		
	}

	@Override
	public void findElement() {
		System.out.println("In Chrome you can find Elements");
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("FireFox can open Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FireFox can maximize Window");
		
	}

	@Override
	public void findElement() {
		System.out.println("In FireFox you can find Elements");
		
	}
	
}
