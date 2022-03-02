package Prueba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba {
	
	private WebDriver driver;

	@Before
	public void configura() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test
	public void test() throws InterruptedException {
		WebElement firsName = driver.findElement(By.id("firstName"));
		firsName.sendKeys("Jose ");
		Thread.sleep(1500);
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Segura");
		Thread.sleep(1500);
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("Jose.segura-proveedor@credibanco.com");
		Thread.sleep(1500);
		WebElement male = driver.findElement(By.className("custom-control-label"));
		male.click();
		Thread.sleep(1500);
		WebElement userNumber = driver.findElement(By.id("userNumber"));
		userNumber.sendKeys("3103107710");
		WebElement hobbies= driver.findElement(By.className("custom-control-label"));
		hobbies.click();
		Thread.sleep(1500);
		WebElement textArea= driver.findElement(By.id("currentAddress"));
		textArea.sendKeys("Prueba para automatizacion");
		Thread.sleep(1500);
		WebElement city= driver.findElement(By.className("css-1uccc91-singleValue"));
		city.click();
		Thread.sleep(1500);
		WebElement city2= driver.findElement(By.className("css-1uccc91-singleValue"));
		city2.click();
		Thread.sleep(1500);
		WebElement submit= driver.findElement(By.id("submit"));
		submit.click();		
	}

}
