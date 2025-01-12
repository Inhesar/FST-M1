package seleniumproject;
import java.awt.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectActivity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		driver.findElement(By.id("menu-item-24")).click();
		String pageheader = driver.getTitle();
		System.out.println(pageheader);
		//driver.quit();
		//driver.findElement(By.xpath("//button [text()='Submit']")).click();
	}

}
