package seleniumproject;
import java.awt.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectActivity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		String url = driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/div/img")).getAttribute("src");
		System.out.println(url);
		driver.quit();
		
	}

}
