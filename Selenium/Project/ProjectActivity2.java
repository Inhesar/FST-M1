package seleniumproject;

import java.awt.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectActivity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		
		if (header.equals("Welcome to Alchemy Jobs"))
		{
		System.out.println(header + "Title is matching as expected");
		}
		else
		{
			System.out.println(header + "is NOT matching as expected");
		}

	}

}
