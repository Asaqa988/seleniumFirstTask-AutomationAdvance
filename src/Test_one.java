import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

public class Test_one {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void myBeforeTest() {
		driver.get("https://www.saucedemo.com/");
	}

//	@Test()
//	public void myTestOne() throws InterruptedException {
//
//		// mne7a
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		// mne7a
//
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//
//		// mne7a
//		driver.findElement(By.cssSelector("[data-test='login-button']")).click();
//
//		// mne7a
//		List<WebElement> AddtoCartButtons = driver.findElements(By.className("btn_primary"));
//
//		for (int i = 0; i < AddtoCartButtons.size(); i++) {
//			AddtoCartButtons.get(i).click();
//
//		}
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.className("shopping_cart_link")).click();
//
//		driver.findElement(By.id("checkout")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("first-name")).sendKeys("abed");
//		driver.findElement(By.id("last-name")).sendKeys("alraheem");
//		driver.findElement(By.id("postal-code")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.name("finish")).click();
//
//		String completeProcessText = driver.findElement(By.className("complete-header")).getText();
//
//		boolean toCheckThankYouMsg = completeProcessText.contains("Thank you") ; 
//		
//		System.out.println(toCheckThankYouMsg);
//				
//		SoftAssert Assert = new SoftAssert();
//		Assert.assertEquals(toCheckThankYouMsg, true);
//
//		Assert.assertAll();
//	}
	
	@Test()
	public void myTestTwo () throws InterruptedException {
		
		// mne7a
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// mne7a

		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// mne7a
		driver.findElement(By.cssSelector("[data-test='login-button']")).click();
		
		
		List<WebElement> AddtoCartButtons = driver.findElements(By.className("btn_primary"));

		for (int i = 0; i < AddtoCartButtons.size(); i++) {
			AddtoCartButtons.get(i).click();

		}


		driver.findElement(By.className("shopping_cart_link")).click();

		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("abed");
		driver.findElement(By.id("last-name")).sendKeys("alraheem");
		driver.findElement(By.id("postal-code")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		String total = driver.findElement(By.className("summary_total_label")).getText();
		
	String [] newTotal = 	total.split("$"); 
	
	System.out.println(newTotal);
		
		System.out.println(total);
	}

	@AfterTest
	public void myAfterTest() {
	}

}
