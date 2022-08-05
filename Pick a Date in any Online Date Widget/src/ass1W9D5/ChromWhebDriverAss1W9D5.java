/**
 * @author Mawaddah Hanbali
 */
package ass1W9D5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWhebDriverAss1W9D5 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */

	@BeforeTest
	public void setUp() throws InterruptedException {
		// The path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		// Open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.jquerymobile.com/1.4.5/datepicker/");
		Thread.sleep(2000); // To load the page
		System.out.println("Website Title: " + driver.getTitle());
	}

	/**
	 * Test Popup Datepicker
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {
		// Current date
		LocalDateTime now = LocalDateTime.now();

		// The date in specific format
		DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
		DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
		DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");

		// Save date as string
		String dayText = day.format(now);
		String monthText = month.format(now);
		String yearText = year.format(now);

		// Print date in console
		System.out.println(day.format(now));

		// Find input element
		WebElement Datepicker = driver.findElement(By.cssSelector("input[class='hasDatepicker']"));
		Datepicker.click();
		Datepicker.sendKeys(dayText + "/" + monthText + "/" + yearText);

		Thread.sleep(5000); // to see the result
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
