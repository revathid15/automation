package module2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_links {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	System.setProperty("webriver.chrome.driver","c://chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("http://demo.guru99.com/test/newtours/");
	d.manage().window().maximize();
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
	WebElement drop=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
	List <WebElement> drop1=drop.findElements(By.tagName("a"));
	System.out.println(drop1.size());
	for(int i=0;i<drop1.size(); i++)
	{
		System.out.println(drop1.get(i).getText());
		drop1.get(i).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
		Thread.sleep(1000);
		
		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		drop=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		drop1=drop.findElements(By.tagName("a"));
	}
	
	
 File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(a1,new File("C:\\Users\\user\\demo.png"));
}
}