package skeleton;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class StepDefinitions 
{
	Person sean=new Person();
	@Given("Sean is {int} meters away from lucia")
	public void sean_is_meters_away_from_lucia(Integer int1)
	{
	  sean.setDistance(int1) ;
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string)
	{
		sean.setMessage(string);


	}

	@Then("Lucia {string} to the message")
	public void lucia_listen_to_the_message(String flag) 
	{
		if(flag.contentEquals("listens"))
		{
	  String message=sean.getMessage();  
	Assert.assertEquals("Free Coffee",message);
	}
		else if(flag.contentEquals("can't listens"))
		{
			String message=sean.getMessage();  
		
		Assert.assertEquals("Cann't hear",message);
		}

}
}
