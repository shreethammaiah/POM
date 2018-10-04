package scripts1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Homepage;
import POM.LoginPagePage;
import POM.SearchItemPage;
import generic.Auto_Constant;
import generic.Excel;
public class SearchItem implements Auto_Constant
{
static
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.DAYS);
	String address=Excel.abc(excelpath,"Sheet1", 0, 0);
	String us=Excel.abc(excelpath,"Sheet1", 1, 0);
	String pwd=Excel.abc(excelpath,"Sheet1", 2, 0);
	String item=Excel.abc(excelpath,"Sheet1", 3, 0);
	String item1=Excel.abc(excelpath,"Sheet1", 4, 0);
	driver.get(address);
	//driver.findElement(By.xpath("//img[@alt='My Account']"));

	LoginPagePage l=new LoginPagePage(driver);
	l.login();
	l.username(us);
	l.password(pwd);
	l.submitbutton();
	
	Homepage h=new Homepage(driver);
	h.myBag();
	h.continuee();
	
	

	SearchItemPage o=new SearchItemPage(driver);
	o.searchbar(item);
	o.enterSearch();
	o.product();
	}
}
	