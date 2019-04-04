
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MagentoTest {
	@Test
	public void magentoTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login l=new Login(driver);
		l.typeEmail();
		l.typePass();
		l.login();
		Account a=new Account(driver);
		a.logout();
		driver.quit();
	}
}