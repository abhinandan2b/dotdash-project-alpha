package stpDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.homepage.VerificationDetails;
import com.homepage.homePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinition {
	public StepDefinition(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	
	@Given("^As a user i should be able to lauch the TODO App And When Service is called with \"([^\"]*)\" Then  I should be able to check the Status of the service$")
	 public void LaunchBrowser(){
		 homePage HP = PageFactory.initElements(driver, homePage.class);
		 homePage.OpenBrowser(); 
	 }
	 
	 
	 @Given("^To identify tasks without categories$")
	 public void to_identify_tasks_without_categories() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 VerificationDetails VD = PageFactory.initElements(driver, VerificationDetails.class);
	     //throw new PendingException();
		 VD.verifydetails();
	 }

	/* @When("^TODO App is launched verify the categories assigned for tasks$")
	 public void todo_App_is_launched_verify_the_categories_assigned_for_tasks() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }

	 @Then("^Verify the tasks without any categories assinged to them$")
	 public void verify_the_tasks_without_any_categories_assinged_to_them() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }

	 @Given("^To Aggregate and print only \"([^\"]*)\"$")
	 public void to_Aggregate_and_print_only(String arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }

	 @When("^TODO App is launched verify the task names and print them by aggregatting it$")
	 public void todo_App_is_launched_verify_the_task_names_and_print_them_by_aggregatting_it() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }

	 @Given("^To print tasks in due date descending order$")
	 public void to_print_tasks_in_due_date_descending_order() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }

	 @Given("^To verify the total Number of tasks$")
	 public void to_verify_the_total_Number_of_tasks() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }

	 @When("^TODO App is launched Then verify the total Number of tasks$")
	 public void todo_App_is_launched_Then_verify_the_total_Number_of_tasks() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     throw new PendingException();
	 }*/
}
