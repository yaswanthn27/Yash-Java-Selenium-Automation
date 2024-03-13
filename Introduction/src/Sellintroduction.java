import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sellintroduction {

	public static void main(String[] args) {
		
			//Invoking browser
			//chrome driver
			//WebDriver is an interface and ChromeDriver is implementing and we need to implement only webdriver implemented methods
			//to connect with chrome browser a third party library will connect to chrome i.e.,. chromedriver.exe or there is inbuilt library in chrome driver class called selenium manager
		    
		    //Chrome Launch
			System.setProperty("webdriver.chrome.driver", "C:/Users/yaswa/Documents/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//Firefox Launch
			//WebDriver driver = new FirefoxDriver();
			//System.setProperty("webdriver.gecko.driver", "C:/Users/yaswa/Documents/geckodriver.exe");
			
			//Microsoft edge Launch
			//WebDriver driver = new EdgeDriver();
			//System.setProperty("webdriver.edge.driver", "C:/Users/yaswa/Documents/msedgeodriver.exe");
			
			driver.get("https://rahulshettyacademy.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
			driver.quit();
			
	}

}
