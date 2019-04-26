package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.AddProducts;
import Pages.RegistartionPages;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefProducts 
{
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getdriver("chrome");
		PageFactory.initElements(driver, AddProducts.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Given("URL of TestMeApp")
	public void url_of_TestMeApp() 
	{
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm"); 
	}

	@When("admin enters the data for addProducts")
	public void admin_enters_the_data_for_addProducts() 
	{
		AddProducts.Username.sendKeys("admin");
		AddProducts.password.sendKeys("Password456");
		AddProducts.login.click();
		
		AddProducts.AddCName.click();
		AddProducts.CategoryNmae.sendKeys("Gadget");
		AddProducts.CategoryNmaeDesc.sendKeys("New category is added");
		AddProducts.add.click();
		driver.navigate().back();
		driver.navigate().back();
		
		AddProducts.AddSubCName.click();
		AddProducts.AddCatName.sendKeys("Gadget");
		AddProducts.AddSubCatName.sendKeys("Laptops");
		AddProducts.AddSubCatDesc.sendKeys("Subcategoty is added");
		AddProducts.AddSubCat.click();
		driver.navigate().back();
		driver.navigate().back();
		
		
		
		
		AddProducts.AddProduct.click();
		AddProducts.Cname.sendKeys("Gadget");
		AddProducts.SCname.sendKeys("Laptops");
		AddProducts.Pname.sendKeys("HP laptop");
		AddProducts.price.sendKeys("35000");
	    AddProducts.quantity.sendKeys("10");
	    AddProducts.brand.sendKeys("HP");
	    AddProducts.description.sendKeys("Only for practice purpose");
	    AddProducts.Product.click();
	    AddProducts.file.sendKeys("C:\\Users\\Training_b6b.00.03\\Pictures\\Screenshots\\Screenshot (1).png");
	    
		
		
	}
	
	 

	@Then("admin add the product successfully")
	public void admin_add_the_product_successfully() 
	{
		Assert.assertTrue(AddProducts.AddProductSuccessfully.getText().contains("Product : HP laptop is added Succesfully"));


	}

}
