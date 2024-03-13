import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/yaswa/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		/*int i=1;
		while(i<5)
		{
			
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
			i++;
			
		}*/
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i =1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
	

	}

}
