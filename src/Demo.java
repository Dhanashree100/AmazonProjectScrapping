import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main (String args[]) {
		
		String url  = "https://www.amazon.in/s?k=tab+for+kids&crid=2TLWWG95A7BDW&sprefix=%2Caps%2C656&ref=nb_sb_ss_recent_1_0_recent";
		String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
		// Create a new instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Add the user agent to the options
        options.addArguments("user-agent=" + userAgent);
        
        WebDriver driver = new ChromeDriver(options);
		
		driver.get(url);
		
		String productName=driver.findElement(By.xpath("//div[@class='rush-component s-featured-result-item ']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Amazon Basics Magic Slate 15-inch LCD Writing Tabl')]")).getText();		
	
		String ProductPrice=driver.findElement(By.xpath("//div[@class='rush-component s-featured-result-item ']//span[@class='a-price-whole'][normalize-space()='969']")).getText();
	
		System.out.println("Product Name:" + productName + "\n \n ProductPrice: " + ProductPrice);
		
		
	}
}
