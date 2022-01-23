package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		d.findElement(By.id("nav-hamburger-menu")).click();
		WebElement drop=d.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]"));
		List <WebElement> drop1=drop.findElements(By.tagName("a"));
		
	}

}
