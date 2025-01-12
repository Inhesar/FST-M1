package seleniumproject;
import java.awt.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ProjectActivity4 {

	public static void main(String[] args)
		{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		String header2 = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header2);
		if (header2.equals("Quia quis non"))
		{
		System.out.println(header2 + "Title is matching as expected");
		}
		else
		{
			System.out.println(header2 + "is NOT matching as expected");
		}
			driver.quit();
		}
}
