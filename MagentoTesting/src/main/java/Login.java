
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);

	}
	By email=By.id("email");
	/*@FindBy(id="email")
	WebElement email;	
	*/
	
	By pwd=By.id("pass");
	/*@FindBy(linkText="pass")
	WebElement pwd;	
	*/
	
	By login=By.id("send2");
	/*@FindBy(linkText="send2")
	WebElement login;	
	*/
	
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("vineetanand61@gmail.com");
		//email.sendkeys("vineetanand61@gmail.com");
	}
	public void typePass()
	{
		driver.findElement(pwd).sendKeys("Welcome123");
		//pwd.sendKeys("Welcome123");
	}
	public void login()
	{
		driver.findElement(login).click();
		//login.click();
	}
}