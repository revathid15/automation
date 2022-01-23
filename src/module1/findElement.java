package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
	WebDriver d;
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
	}
	public void title()
	{
		System.out.println(d.getTitle());
	}
	public void url()
	{
		System.out.println(d.getCurrentUrl());
	}
	public void gmail()
	{
		d.findElement(By.linkText("Gmail")).click();
		System.out.println("gmail page");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
	}
	public void navback()
	{
		d.navigate().back();
		
	}
	public void close_browser()
	{
		d.close();
	}
	public static void main(String[] args)
	{
	findElement fe=new findElement();
	fe.open();
	fe.title();
	fe.url();
	fe.gmail();
	fe.navback();
	fe.close_browser();
	}
	}