package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectActivity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.findElement(By.id("menu-item-24")).click();
		String pageheader = driver.getTitle();
		System.out.println(pageheader);
		
		WebElement inputBox = driver.findElement(By.id("search_keywords"));
		inputBox.click();
		inputBox.sendKeys ("Banking");
		driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/img"));
		driver.findElement(By.xpath("//*[@id=\"post-8368\"]/div/div/div/div[3]/input")).click();
		WebElement emailid = driver.findElement(By.xpath("//*[@id=\"post-8368\"]/div/div/div/div[3]/div/p/a"));
		System.out.println(emailid);
		
		//driver.quit();
		
	}

}
