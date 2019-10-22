package pages;

import org.openqa.selenium.WebDriver;

public class DealsPage {
	WebDriver driver;
	
	public DealsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void method_gitUpdate()
	{
		System.out.println("first git updation method");
	}
	
	public void silver_branch()
	{
		System.out.println("Silver branch method");
	}

}
