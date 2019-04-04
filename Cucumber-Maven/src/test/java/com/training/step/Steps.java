package com.training.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

static WebDriver driver;
	
	@Given("^launch the browser with URL$")
	public void launch_the_browser_with_URL() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "/Users/sakeerthi/Documents/chromedriver");
		driver = new ChromeDriver();
		String url = "https://login.salesforce.com/"; 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(" Browser is launched with the Saleforce URL");

	}

	@When("^enter user name$")
	public void enter_user_name() throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys("krithika@oracle.com");	
		System.out.println(" Username is entered ");
	    
	}

	@Then("^enter the password$")
	public void enter_the_password() throws Throwable {
		
		driver.findElement(By.id("password")).sendKeys("aarav143");	
		System.out.println(" Password is entered ");
	    
	}

	@Then("^check the remember me checkbox$")
	public void check_the_remember_me_checkbox() throws Throwable {
	    
		driver.findElement(By.id("rememberUn")).click();
		System.out.println(" Checked on Remember me ");

	}

	@Then("^click on Login$")
	public void click_on_Login() throws Throwable {
	    
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(" Login is clicked ");

	}

	@Then("^User is Logged in to the page$")
	public void user_is_Logged_in_to_the_page() throws Throwable {
	    
		Thread.sleep(3000);
		System.out.println(" User is logged in to the page Successfully ");

	}

	@Given("^Hover over the user menu$")
	public void hover_over_the_user_menu() throws Throwable {
	    
		WebElement user = driver.findElement(By.cssSelector("#userNavLabel"));
		Actions action = new Actions(driver);
		action.moveToElement(user).build().perform();

	}

	@When("^Select the user menu$")
	public void select_the_user_menu() throws Throwable {
	    
		WebElement dropdown = driver.findElement(By.cssSelector("#userNavLabel"));
		dropdown.click();
		System.out.println();
		System.out.println(" User Menu got selected ");

	}

	@Given("^Click On The Developer Console$")
	public void click_On_The_Developer_Console() throws Throwable {
	    
		String  window = driver.getWindowHandle();
		WebElement con = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		con.click();
		System.out.println(" Developer Console is clicked ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^Developer console selected$")
	public void developer_console_selected() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(" Developer console is selected ");
		System.out.println(" New Window got opened ");
	   
	}

	@Then("^Switching to Old Window$")
	public void switching_to_Old_Window() throws Throwable {
		
		String  oldWindow = driver.getWindowHandle();
		driver.switchTo().window(oldWindow);
		System.out.println(" Old Window opened ");
	}
	
	@Given("^Click the Accounts tab$")
	public void click_the_Accounts_tab() throws Throwable {
		
		driver.findElement(By.linkText("Accounts")).click();
		System.out.println(" Account tab has chosen");
	}

	@When("^Click the Create New tab$")
	public void click_the_Create_New_tab() throws Throwable {
	    
		WebElement dropdown1 = driver.findElement(By.xpath("//span[contains(text(),'Create New...')]"));	
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tryLexDialogX"))).click();	 
        dropdown1.click();
		System.out.println("Create New dropdown is selected");
	}

	@Then("^Select Account from dropdown$")
	public void select_Account_from_dropdown() throws Throwable {
	
		driver.findElement(By.xpath("//a[@class='accountMru menuButtonMenuLink']")).click();
		System.out.println(" Account is clicked ");
	}

	@Then("^Enter the Account Name$")
	public void enter_the_Account_Name() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@name='acc2']")).sendKeys("keerthy");
		System.out.println("New Account Name is entered ");
	}

	@Then("^Save the account name$")
	public void save_the_account_name() throws Throwable {
	    
		driver.findElement(By.xpath("//td[@class='pbButton']//input[@title='Save']")).click();
		System.out.println("New Account Name is saved ");
		Thread.sleep(3000);
	}
	
	
	@Given("^Click on the Logout$")
	public void click_on_the_Logout() throws Throwable {
	    
		WebElement dropdown = driver.findElement(By.cssSelector("#userNavLabel"));
		dropdown.click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		System.out.println(" Log out is clicked ");
		
	}

	@When("^User Logged out from the Application$")
	public void user_Logged_out_from_the_Application() throws Throwable {
	    
		Thread.sleep(2000);
		driver.quit();
		System.out.println("User is logged out from the Application successfully ");

	}

}




