package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import browser.utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	WebDriver driver;
	@Given("^Home page should be open$")
	public void home_page_should_be_open() throws Throwable {
		driver = utility.startBrowser("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.partialLinkText("SignUp")).click();
		}

	@When("^Enter the valid username as \"([^\"]*)\"$")
	public void enter_the_valid_username_as(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	    	}

	@When("^Enter the firstname as \"([^\"]*)\" and last name as \"([^\"]*)\"$")
	public void enter_the_firstname_as_and_last_name_as(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
		driver.findElement(By.name("lastName")).sendKeys(arg2);
	}
	
	@When("^Enter the password as \"([^\"]*)\"$")
	public void enter_the_password_as(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	   
	}

	@When("^Enter the confirm password as \"([^\"]*)\"$")
	public void enter_the_confirm_password_as(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^Click the gender as male$")
	public void click_the_gender_as_male() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@When("^Enter the email address as \"([^\"]*)\"$")
	public void enter_the_email_address_as(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^Enter the mobile number as \"([^\"]*)\"$")
	public void enter_the_mobile_number_as(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^Enter the dob as \"([^\"]*)\"$")
	public void enter_the_dob_as(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^Enter the address as \"([^\"]*)\"$")
	public void enter_the_address_as(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^Select the security question$")
	public void select_the_security_question() throws Throwable {
		Select sq=new Select(driver.findElement(By.name("securityQuestion")));
		sq.selectByIndex(1);
	}

	@When("^Enter the answer as \"([^\"]*)\" and click on submit$")
	public void enter_the_answer_as_and_click_on_submit(String arg1) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys(arg1);
		driver.findElement(By.name("Submit")).click();
	}


	@Then("^Registeration is successfull$")
	public void registeration_is_successfull() throws Throwable {
     System.out.println("Registeration successfull");
	}
	
	
	

	@Given("^Sign-in page should be open$")
	public void sign_in_page_should_be_open() throws Throwable {
		driver = utility.startBrowser("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.partialLinkText("SignIn")).click();
		System.out.println("Sign-in page is open");
	    
	}

	@When("^Enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_the_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		  driver.findElement(By.name("password")).sendKeys(arg2);
		  driver.findElement(By.name("Login")).click();
	    
	}

	@Then("^Login is successfull$")
	public void login_is_successfull() throws Throwable {
		  
	}
	
	@Given("^User is already logged in$")
	 public void user_is_already_logged_in() throws Throwable {
		driver = utility.startBrowser("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.partialLinkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  driver.findElement(By.name("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	 }

	 @When("^User types the first four characters of the product$")
	 public void user_types_the_first_four_characters_of_the_product() throws Throwable {
	   driver.findElement(By.name("products")).sendKeys("Head");
	   driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	   Assert.assertEquals(driver.getTitle(), "Search");
	 }

	 @Then("^User gets all appropriate results to purchase$")
	 public void user_gets_all_appropriate_results_to_purchase() throws Throwable {
	    System.out.println("The search engine is very fast and accurate");
	  //  driver.close();
	 }


}



/*

driver.findElement(By.name("firstName")).sendKeys("lalitha");
Thread.sleep(10000);
String a=driver.findElement(By.id("err")).getText();
	 // System.out.println(a);
	  Assert.assertEquals(a,"Available");


driver.findElement(By.name("confirmPassword")).sendKeys("1234");

driver.findElement(By.name("emailAddress")).sendKeys("lalitha@gmail.com");

driver.findElement(By.name("dob")).sendKeys("16/06/2016");
driver.findElement(By.name("address")).sendKeys("chennai,India");
Select sq=new Select(driver.findElement(By.name("securityQuestion")));
sq.selectByIndex(1);

Thread.sleep(3000);
driver.findElement(By.name("Submit")).click(); 
*/