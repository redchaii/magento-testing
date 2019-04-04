
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
public class Account {
	WebDriver driver;
	public Account(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	By logout=By.linkText("Log Out");
	
	/*@FindBy(linkText="Log Out")
	WebElement logout;	
	*/
	public void logout()
	{
		driver.findElement(logout).click();
		//logout.click();
	}
}