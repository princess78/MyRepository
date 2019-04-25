package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.RegistartionPages;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsReg 
{
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getdriver("chrome");
		PageFactory.initElements(driver, RegistartionPages.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Given("url of the demowebshop")
	public void url_of_the_demowebshop()
	{
		driver.get("http://demowebshop.tricentis.com/register");

	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration()
	
	{
		RegistartionPages.gender.click();
		RegistartionPages.Firstname.sendKeys("kalyani1");
		RegistartionPages.Lastname.sendKeys("kala2");
		RegistartionPages.Email.sendKeys("kala1234@gmail.com");
		RegistartionPages.Password.sendKeys("1234564");
		RegistartionPages.ConfirmPassword.sendKeys("1234564");
		RegistartionPages.Register.click();
		RegistartionPages.conti.click();


	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully()
	{
		Assert.assertTrue(RegistartionPages.message.getText().contains("Your registration completed"));

	}


}
