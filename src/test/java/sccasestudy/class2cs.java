package sccasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class class2cs {
	WebDriver driver;
	@Given("I Enters username")
	public void i_Enters_username() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("admin");
	}

	@Given("I Enters password")
	public void i_Enters_password() {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password456");
	}

	@Then("I Enters Login")
	public void i_Enters_Login1() {
		  driver.findElement(By.name("Login")).submit();
	}

	@Then("I clicks on Add New Poduct")
	public void i_clicks_on_Add_New_Poduct() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button")).click();
	   
	}

	@Then("I Enters details")
	public void i_Enters_details() {
	   
	}

	@Then("I Enters Add product")
	public void i_Enters_Add_product() {
	 
	}

	@When("I Enters Login")
	public void i_Enters_Login() {
	  
	}

	@Then("I adds product to the cart")
	public void i_adds_product_to_the_cart() {
	    
	}

	@Then("I Enters Add category name as {string}")
	public void i_Enters_Add_category_name_as(String string) {
	 
	}

	@Then("I Enters sub category  as {string}")
	public void i_Enters_sub_category_as(String string) {
	  
	}

	@Then("I Enters product name as {string}")
	public void i_Enters_product_name_as(String string) {
	   
	}

	@Then("I Enters price as {string}")
	public void i_Enters_price_as(String string) {
	   
	}

	@Then("I Enters quantity as {string}")
	public void i_Enters_quantity_as(String string) {
	   
	}

	@Then("I Enters Brand as {string}")
	public void i_Enters_Brand_as(String string) {
	    
	}

	@Then("I Enters Descrption as {string}")
	public void i_Enters_Descrption_as(String string) {
	    
	}

	@Then("I clicks on Add product")
	public void i_clicks_on_Add_product() {
	   
	}


}
