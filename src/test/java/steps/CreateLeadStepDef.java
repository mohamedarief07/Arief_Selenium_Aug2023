package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDef  extends BaseClass {
	
	@When("Click on {string} link")
	public void click_on_crm_sfa_link(String linkText) {
		driver.findElement(By.partialLinkText(linkText)).click();
	}
	@Then("HomePage should be displayed")
	public void home_page_should_be_displayed() {
		String title = driver.getTitle();
		//System.out.println("Title of Resulting Page is " + title);

		if (title.contains("My Home")) {
			System.out.println("HomePage displayed- PASSED");

		} else {
			System.out.println("HomePage not displayed-Failed");
		}

	}
	@Then("Click on Leads Link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@Then("Click on Create Leads Link")
	public void click_on_create_leads_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the companyName as (.*)$")
	public void enter_the_company_name_as_arief_international(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@Given("Enter the firstName as (.*)$")
	public void enter_the_first_name_as_arief(String fn) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
	}
	@Given("Enter the lastName as (.*)$")
	public void enter_the_last_name_as_khan(String ln) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
	}
	@When("click on Subit Button")
	public void click_on_subit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("ViewLeadsPage should be displayed")
	public void view_leads_page_should_be_displayed() {
		String title = driver.getTitle();
	//	System.out.println("Title of Resulting Page is " + title);

		if (title.contains("View Lead")) {
			System.out.println("Lead is created-PASSED");

		} else {
			System.out.println("Lead not created- FAIELD");
		}

	}


}
