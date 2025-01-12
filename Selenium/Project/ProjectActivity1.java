package seleniumproject;

import java.awt.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ProjectActivity1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		String title = driver.getTitle();
		if (title.equals("Alchemy Jobs – Job Board Application"))
		{
		System.out.println(title + "Title is matching as expected");
		}
		else
		{
			System.out.println(title + "is NOT matching as expected");
		}
		//System.out.println("Header of page " + driver.getTitle());
		//driver.findElement(By.id("username")).sendKeys("root");
		//driver.findElement(By.id("password")).sendKeys("pa$$w0rd");
		//driver.findElement(By.xpath("//button [text()='Submit']")).click();
		//String message = driver.findElement(By.tagName("h1")).getText();
		//System.out.println(message);
		//driver.quit();
	}}
