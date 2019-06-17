package selencucum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class class2 {
	WebDriver driver;
	@Given("I Enters username")
	public void i_Enters_username() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	      driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	    
	}

	@Given("I Enters password")
	public void i_Enters_password() {
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	   
	}

	@When("I Enters Login")
	public void i_Enters_Login() {
		 driver.findElement(By.name("Login")).submit();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	  
	}

	@Given("I Enters product name in the field")
	public void i_Enters_product_name_in_the_field() {
	   
	}

	@Given("I Enters Add to Cart")
	public void i_Enters_Add_to_Cart() {
	   
	}

	@Then("I proceeds to payment")
	public void i_proceeds_to_payment() {
	  
	}

	@Given("I Enters confirm")
	public void i_Enters_confirm() {
	   
	}

	@Given("I Enters bank details")
	public void i_Enters_bank_details() {
	  
	}

	@When("I Enters ok")
	public void i_Enters_ok() {
	    
	}

	@Then("I clicks sign out")
	public void i_clicks_sign_out() {
	  
	}


}
