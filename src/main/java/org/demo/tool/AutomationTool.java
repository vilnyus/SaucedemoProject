package org.demo.tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomationTool {
    protected WebDriver     driver;
    protected String        sBrowserName;
    protected WebElement    element;
    protected By            username;
    protected By            password;
    protected By            logniButton;
    protected By            burgerMenuButton;



    public AutomationTool() {
        driver          = null;
        sBrowserName    = null;
        element         = null;
        username        = new By.ById("user-name");
        password        = new By.ById("password");
        logniButton     = new By.ById("login-button");
        burgerMenuButton = new By.ById("react-burger-menu-btn");
    }

    public Boolean OpenBroswer(String sBroswerType){
        if(sBroswerType.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Projects\\SaucedemoProject\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return true;
    }

    public Boolean GoToPage(String sUrlSite){
        driver.get(sUrlSite);
        return true;
    }

    public void LoginSubmit(String sUserName, String sPassword){
        driver.findElement(username).sendKeys(sUserName);
        driver.findElement(password).sendKeys(sPassword);
        driver.findElement(logniButton).submit();
    }

    public Boolean ClickBurgerButton(){
        driver.findElement(burgerMenuButton).click();
        return true;
    }

    public void CloseBrowser(){
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }
}
