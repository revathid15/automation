package module1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_variable {
	WebDriver d;
	Scanner read=new Scanner(System.in);
	 String  username;
	String pwd;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
	}
public void login() throws InterruptedException
	{
		System.out.println("enter username");
		username = read.next();
		d.findElement(By.name("txtUsername")).sendKeys(username);
		System.out.println("enter password");
		pwd = read.next();
		d.findElement(By.name("txtPassword")).sendKeys(pwd);
		Thread.sleep(2000);
		d.findElement(By.name("submit")).click();
	}
public void close()
{
	d.close();
	
}
public static void main(String[] args) throws InterruptedException
{
	login_variable a1= new login_variable();
	a1.opening_browser();
	a1.login();
	a1.close();
}
}