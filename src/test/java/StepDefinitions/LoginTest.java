package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Before
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("open URL")
	public void open_URL() {
		driver.get("http://115.160.252.30:85/REsume_Tracker_Test/MainLogin.php");
	}

	@When("Enter {string} and {string}")
	public void enter_and(String Username, String Password) {
		WebElement Uname=driver.findElement(By.id("username"));
		Uname.sendKeys(Username);
		WebElement Pword=driver.findElement(By.id("password"));
		Pword.sendKeys(Password);
	}

	@When("Select Role")
	public void select_Role() {
		WebElement role=driver.findElement(By.id("group"));
		Select role1=new Select(role);
		role1.selectByVisibleText("Recruiter");
	}

	@Then("Click on sign on button")
	public void click_on_sign_on_button() throws IOException {
		WebElement signIn=driver.findElement(By.xpath("//input[@name='submit']"));
		signIn.click();
		String title=driver.getTitle();
		if(title.equals("Applicant Tracker"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertFalse(false);
		}
	}

	@After
	public void Teardown()
	{
		driver.quit();
	}

	public static void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot screenShot=(TakesScreenshot)driver;
		File source=screenShot.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}
}
