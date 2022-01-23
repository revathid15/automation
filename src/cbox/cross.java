package cbox;

import org.openqa.selenium.chrome.ChromeDriver;

public class cross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="chrome";
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe" );
			ChromeDriver d=new ChromeDriver();
			d.get("http://www.google.com");
			break;
		default:
			System.out.println("No browser");
		}
		}

}
