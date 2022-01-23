package amazon;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expectedvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("htps://www.amazon.com/");
		System.out.println(dr.getTitle());
		dr.manage().window().maximize();
		String actualtitle=dr.getTitle();
		String exptitle;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter expected title");
		exptitle=sc.next();
		//exptitle=exptitle+sc.nextLine();
		if(exptitle.equalsIgnoreCase(dr.getTitle())) {
			System.out.println(actualtitle);
		}
	sc.close();

	}

}
