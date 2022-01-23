package Bank_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Customer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe"); 
		ChromeDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/V1/html/Managerhomepage.php");
		d.manage().window().maximize();
		d.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		d.findElement(By.name("name")).sendKeys("Ritvik");
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
		d.findElement(By.name("dob")).sendKeys("12/09/2021");
		d.findElement(By.name("addr")).sendKeys("Valle Bluff");
		d.findElement(By.name("city")).sendKeys("San Antonio");
		d.findElement(By.name("state")).sendKeys("Texas");
		d.findElement(By.name("pinno")).sendKeys("780150");
		d.findElement(By.name("telephoneno")).sendKeys("9042943546");
		d.findElement(By.name("emailid")).sendKeys("revathid15@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.name("sub")).click();
	}

}
