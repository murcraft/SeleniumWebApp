package by.htp.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {
	
	private final Logger logger = LogManager.getRootLogger();
	private final String URL = "https://belavia.by/";
	
	private final By tabLocator = By.cssSelector("#navtab > ul > li:nth-child(1) > a");
	private final By inputFromLocator = By.xpath("//input[@id='OriginLocation_Combobox']");
	private final By inputToLocator = By.xpath("//input[@id='DestinationLocation_Combobox']");
	private final By buttonFind = By.xpath("//button[@class='button btn-large btn btn-b2-green ui-corner-all']");
	private final By radioButton = By.xpath("//div[@id='step-2']/div[1]/div/label[1]");
	private final By inputDateTo = By.xpath("//div[@id='step-2']/div[2]/div[1]/div/a");
	private final By inputDateBack = By.xpath("//div[@id='step-2']/div[2]/div[2]/div/a");
	private final By selectPasseger = By.xpath("//a[@id='ui-id-1']");
	private final By getRightMonthYear = By.xpath("//div[@id='calendar']/div/div[1]/div/div");///span[1]");
	private final By getLeftMonthYear = By.xpath("//div[@id='calendar']/div/div[2]/div/div");
	private final By getPreviousCalendarMonth = By.xpath("//div[@id='calendar']/div/div[1]/div/a");
	private final By getNextCalendarMonth = By.xpath("//div[@id='calendar']/div/div[2]/div/a");
	private final By getDayOfMonth = By.xpath("//*[@id='calendar']/div/div[1]/table/tbody/tr[1]/td[3]/a");

	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(URL);
		logger.info("Page is opened");
	}

}
