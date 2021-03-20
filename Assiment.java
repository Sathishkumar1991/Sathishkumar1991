package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SathishKumar");
		driver.findElement(By.name("parentPartyId")).sendKeys("democlass1");
		driver.findElement(By.id("groupNameLocal")).sendKeys("TextLeaf");
		driver.findElement(By.id("officeSiteName")).sendKeys("TextLeaf");
		driver.findElement(By.id("annualRevenue")).sendKeys("5Lakhs");
		WebElement PreferredCurrency = driver.findElement(By.id("currencyUomId"));
		Select dd1=new Select(PreferredCurrency);
		dd1.selectByVisibleText("INR - Indian Rupee");
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select dd2=new Select(Industry);
		dd2.selectByVisibleText("Computer Software");
		driver.findElement(By.id("numberEmployees")).sendKeys("0458");
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd3=new Select(Ownership);
		dd3.selectByValue("OWN_CCORP");
		driver.findElement(By.id("sicCode")).sendKeys("SathishKumar");
		driver.findElement(By.id("tickerSymbol")).sendKeys("SK");
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select dd4= new Select(Source);
		dd4.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select dd5=new Select(MarketingCampaign);
		dd5.selectByValue("CATRQ_AUTOMOBILE");
		WebElement InitialTeam = driver.findElement(By.id("initialTeamPartyId"));
		Select dd8=new Select(InitialTeam);
		dd8.selectByValue("DemoSalesTeam1");
		driver.findElement(By.name("description")).sendKeys("Hi All Home Assignment");
		driver.findElement(By.name("importantNote")).sendKeys("TestLeaf Assignment week2 day2");
		driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("0861");
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("8074747058");
		driver.findElement(By.id("primaryPhoneExtension")).sendKeys("Sathish");
		driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("Brother");
		driver.findElement(By.id("primaryEmail")).sendKeys("sathish.jvp@gmail.com");
		driver.findElement(By.id("primaryWebUrl")).sendKeys("http://leaftaps.com/crmsfa/control/createAccountForm");
		driver.findElement(By.id("generalToName")).sendKeys("SathishKumar");
		driver.findElement(By.id("generalAttnName")).sendKeys("Juvvalapalem");
		driver.findElement(By.id("generalAddress1")).sendKeys("No 2 adipatham street");
		driver.findElement(By.id("generalAddress2")).sendKeys("cholan nagar,Annanur");
		driver.findElement(By.id("generalCity")).sendKeys("Nellore");
		WebElement Country = driver.findElement(By.id("generalCountryGeoId"));
		Select dd6=new Select(Country);
		dd6.selectByValue("IND");
		driver.findElement(By.id("generalPostalCode")).sendKeys("524004");
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd7=new Select(State);
		dd7.selectByVisibleText("India");
		driver.findElement(By.id("generalPostalCodeExt")).sendKeys("Nellore");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
