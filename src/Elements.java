import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String args[]) throws IOException {
		
		Properties pro = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\Utilities\\data1.properties";
		FileInputStream file=new FileInputStream(path);
		pro.load(file);
		WebDriver driver= new ChromeDriver();
		
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> elements = driver.findElements(By.xpath("//span[@id='productTitle']"));
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}
		
		driver.close();
		
	}
}
