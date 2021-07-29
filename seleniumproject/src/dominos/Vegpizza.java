package dominos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Vegpizza 
{

	public static void main(String[] args) throws InterruptedException
	
	   //Browser initiation 
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://pizzaonline.dominos.co.in/menu");
		System.out.println("webpage found");
		driver.manage().window().maximize();
		
     //Vegpizza 
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[3]/span")).click();
		System.out.println("Veg Pizza Selected");
		
    // Margerita pizza 
		
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[4]/div/div[2]/div/div/div[1]/div/div[1]/img")).click();
		System.out.println("margerita Pizza Selected");
		
   // Select size 
		
		WebElement size = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[1]/div/div[1]/div/div[1]/div[2]/span[1]"));
		size.click();
		
   // Add crust
		
		WebElement crust = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[1]/div/div[2]/div/div/div/div/div[2]/ul/li[3]/div/div[1]/span[1]"));
		crust.click();
		
  // Add veg toppings and extra cheese
		
		WebElement add_cheese = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[2]/div"));
		js.executeScript("arguments[0].click()",add_cheese);
		System.out.println("cheese added");
		WebElement add_mashroom = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[3]/div[2]/div[2]/div/div/div/div[2]/ul/li[1]/div/div[2]"));
		js.executeScript("arguments[0].click()",add_mashroom);
		System.out.println("mashroom added");
		WebElement add_onion = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[3]/div[2]/div[2]/div/div/div/div[2]/ul/li[2]"));
		add_onion.click();
		System.out.println("onion added");
		WebElement add_cpsicm = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[3]/div[2]/div[2]/div/div/div/div[2]/ul/li[3]"));
		add_cpsicm.click();
		System.out.println("capcicm added");
		
	//Add non-veg toppings
		
		WebElement add_chiken = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[3]/div[3]/div[3]/div[2]/div/div/div/div[2]/ul/li[1]/div/div[2]"));
		js.executeScript("arguments[0].click()",add_chiken);
		System.out.println("chiken added");
	
	// Add to cart
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div[4]/div/div[2]/button/span")).click();;
		System.out.println("added to cart");
		
	//Increase Quantity
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]")).click();;
		System.out.println("quantity increased");
		
	//Checkout
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button/span")).click();;
		System.out.println("checkout");
		
	//Adress
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[1]/div/div[1]/div[2]/div")).click();;
		System.out.println("clicked on add location");
		
	//Enter Address
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/div[1]/input")).sendKeys("navi mumbai");
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[2]/div/ul/li[1]/div[2]/span[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("Koparkhairane");
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div[2]/div/ul/li[4]/div[2]")).click();
		System.out.println("adress selected");
		
	// close page	
		
	   // driver.close();
		
	
		

	}

}
