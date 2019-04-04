
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
public class Welcome {
	WebDriver driver;
	public Welcome( WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	By myacct=By.linkText("My Account");
	/*@FindBy(linkText="My Account")
	WebElement myacct;	
	*/
	
	public void clickOnMyAccount()
	{
		driver.findElement(myacct).click();
		//myacct.click();
	}
}