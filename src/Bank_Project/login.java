package Bank_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("http://demo.guru99.com/V1/index.php");
	d.manage().window().maximize();
	d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a")).click();
	d.findElement(By.name("uid")).sendKeys("mngr373160");
	d.findElement(By.name("password")).sendKeys("JApabed");
	Thread.sleep(2000);
	d.findElement(By.name("btnLogin")).click();
	
	
	}

}
