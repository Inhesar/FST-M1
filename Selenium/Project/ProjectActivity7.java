package seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ProjectActivity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		//driver.findElement(By.id("menu-item-24")).click();
		String pageheader = driver.getTitle();
		System.out.println(pageheader);
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a")).click();
		
		WebElement emailid = driver.findElement(By.xpath("//*[@id=\"create_account_email\"]"));
		emailid.click();
		emailid.sendKeys("syed.inhesar.nabi@ibm.com");
		
		WebElement jobtitle = driver.findElement(By.xpath("//*[@id=\"job_title\"]"));
		jobtitle.click();
		jobtitle.sendKeys("Project Manager IBM Noida");
		
		//WebElement description = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
		WebElement description = driver.findElement(By.xpath("/html"));
		description.click();
		description.sendKeys("descrition of job");
		
		WebElement appemail = driver.findElement(By.xpath("//*[@id=\"application\"]"));
		appemail.click();
		appemail.sendKeys("www.trainingsyed.com");
		
		WebElement companyname = driver.findElement(By.xpath("//*[@id=\"company_name\"]"));
		companyname.click();
		companyname.sendKeys("IBM India");
		
		
		driver.findElement(By.xpath("//*[@id=\"submit-job-form\"]/p/input[4]")).click();
		
		
		WebElement inputBox = driver.findElement(By.id("search_keywords"));
		inputBox.click();
		inputBox.sendKeys ("Project Manager IBM Noida");
		driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/img"));
		driver.findElement(By.xpath("//*[@id=\"post-8368\"]/div/div/div/div[3]/input")).click();
		WebElement emailid1 = driver.findElement(By.xpath("//*[@id=\"post-8368\"]/div/div/div/div[3]/div/p/a"));
		System.out.println(emailid1);
		
		//driver.quit();
	}

}
