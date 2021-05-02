package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDenitionforSignup {
	
	WebDriver driver;
	
		@Given("Iam able to navigate to login page")
		public void iam_able_to_navigate_to_login_page() {
			System.setProperty("webdriver.chrome.driver","C:\\Sindhu\\SDET\\required\\chromedriver.exe");
			driver = new ChromeDriver(); //this is to open the instance of the url
			driver.get("http://elearningm1.upskills.in/");//this is to open the application
			driver.manage().window().maximize();//if i want to maximize the screen
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//if i need to wait for sometime
		}

		@When("I click on signup")
		public void i_click_on_signup() {
		    // Write code here that turns the phrase above into concrete actions
			  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		}
		
		@When("I enter the First name as {string}")
		public void i_enter_the_first_name_as(String string) {
			driver.findElement(By.id("registration_firstname")).sendKeys(string);
		}
		@When("I enter the Last name as {string}")
		public void i_enter_the_last_name_as(String string) {
			driver.findElement(By.id("registration_lastname")).sendKeys(string);
		}
		@When("I enter the e-mail as {string}")
		public void i_enter_the_e_mail_as(String string) {
			driver.findElement(By.id("registration_email")).sendKeys(string);
		}
		@When("I enter the username as {string}")
		public void i_enter_the_username_as(String string) {
		    driver.findElement(By.id("username")).sendKeys(string);
		}
		@When("I enter the pass as {string}")
		public void i_enter_the_pass_as(String string) {
			driver.findElement(By.id("pass1")).sendKeys(string);
		}
		@When("I enter the Confirm password as {string}")
		public void i_enter_the_confirm_password_as(String string) {
			driver.findElement(By.id("pass2")).sendKeys(string);
		}
		@When("I Click on the Register button")
		public void i_click_on_the_register_button() {
			driver.findElement(By.id("registration_submit")).click();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}@When("I click on the profile photo")
		public void i_click_on_the_profile_photo() {
			//Screenshot screenshot = new Ashot().takeScreenshot(driver);
				  //driver.findElement(By.linkText("dropdown avatar-user open")).click();
				   driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/unknown.png']")).click(); //to click on the image
				   //driver.findElement(By.xpath("//a[@href='#']")).click(); //to click on the arrow mark
				   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				}
				@When("I click on compose message icon")
				public void i_click_on_compose_message_icon() {
					driver.findElement(By.xpath("//a[@title='Homepage']")).click();//click on homepage
				    driver.findElement(By.xpath("//a[contains(text(),'Compose')]")).click();//click on compose mail
				}
				@When("I enter the send to as {string}")
				public void i_enter_the_send_to_as(String string) {
				    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(string);
				    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				    driver.findElement(By.xpath("//*[contains(text(),'Sindhu S (Sindhu)')]")).click();
				  
				}
				@When("I enter the subject as {string}")
				public void i_enter_the_subject_as(String string) {
				driver.findElement(By.id("compose_message_title")).sendKeys(string);
				driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				}
				//@When("I enter the Message as {string}")
				//public void i_enter_the_message_as(String string) {
				//driver.findElement(By.xpath ("/html/body/p']")).sendKeys(string);
				//driver.findElement(By.xpath("//html//body[@contenteditable]//p")).sendKeys(string);
				//}
				@When("I click on Send message")
				public void i_click_on_send_message() {
				    driver.findElement(By.id("compose_message_compose")).click();
				}
				@Then("I verify the acknowledgement by clicking on outbox.")
				public void i_verify_the_acknowledgement_by_clicking_on_outbox() {
				   //driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/outbox.png'")).click();
				   driver.findElement(By.xpath("//img[@title='Outbox']")).click();
}
		
}