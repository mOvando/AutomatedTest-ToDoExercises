import org.openqa.selenium.By;
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    private WebDriver driver;
    private String appURL = "file:///C:/Users/Daniel/Documents/automated%20testing/TP_mvn/index.html";
    private String mainURL = "file:///C:/Users/Daniel/Documents/automated%20testing/TP_mvn/todomvc-master/index.html";
    private String todoURL = "file:///C:/Users/Daniel/Documents/automated%20testing/TP_mvn/todomvc-master/examples/dojo/index.html";
    private By USER_INPUT = By.xpath("//input[@name='user']");
    private By PASS_INPUT = By.xpath("//input[@name='password']");
    private By BUTTON_INPUT = By.xpath("//input[@type='submit']");
    private By DOJO_LINK = By.xpath("//a[@href='examples/dojo/index.html']");
    private By TODO_INPUT = By.xpath("//input[@id='new-todo']");
    private By BUTTON_DESTROY = By.xpath("//input[@type='submit']");
    private By TODO_ITEM = By.xpath("//li[1]");
    private String user = "admin";
    private String password = "123";
    private String first_todo = "learn xpath";
    private String second_todo = "learn selenium";
    private String third_todo = "learn intellj";
    private String fourth_todo = "conquer world";

//    private String SEARCH_RANDOM = "random";
//    private String GOOGLE_TITLE = "Google";

    @BeforeClass
    // Setting chromedriver driver
    public void testSetUp() {
        // Call chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:/Users/Daniel/Documents/automated testing/ejLocales/chromedriver.exe");
        //Disable barInfo
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
    }

//    @Test
//    // Ejecuting Test
//    public void scenario1() {
//        String bad_user = "cualquiera";
//        String bad_pass = "password";
//        By ERROR_LOGIN = By.xpath("//p[text()='Error de credenciales']");
//        //Open Page
//        driver.get(appURL);
//        //Fill out input for user and password
//        driver.findElement(USER_INPUT).sendKeys(bad_user);
//        driver.findElement(PASS_INPUT).sendKeys(bad_pass);
//        //Click in button
//        driver.findElement(BUTTON_INPUT).click();
//        //Check for error
//        driver.findElement(ERROR_LOGIN).click();
//    }

//    @Test
//    // Ejecuting Test
//    public void scenario2() {
//        //Open Page
//        driver.get(appURL);
//        //Fill out input for user and password
//        driver.findElement(USER_INPUT).sendKeys(user);
//        driver.findElement(PASS_INPUT).sendKeys(password);
//        //Click in button
//        driver.findElement(BUTTON_INPUT).click();
//        //Check for url
//        String getUrl = driver.getCurrentUrl();
//        Assert.assertEquals(getUrl, mainURL);
//    }

//    @Test
//    // Ejecuting Test
//    public void scenario3() {
//        //Open Page
//        driver.get(appURL);
//        //Fill out input for user and password
//        driver.findElement(USER_INPUT).sendKeys(user);
//        driver.findElement(PASS_INPUT).sendKeys(password);
//        //Click in button
//        driver.findElement(BUTTON_INPUT).click();
//        //Check for url
//        String getUrl = driver.getCurrentUrl();
//        Assert.assertEquals(getUrl, mainURL);
//        //Click example
//        driver.findElement(DOJO_LINK).click();
//        //Check for url
//        String todoUrl = driver.getCurrentUrl();
//        Assert.assertEquals(todoUrl, todoURL);
//        //Find a way to make every example work
//    }
//
//    @Test
//    // Ejecuting Test
//    public void scenario4() {
//        //Open Page
//        driver.get(appURL);
//        //Fill out input for user and password
//        driver.findElement(USER_INPUT).sendKeys(user);
//        driver.findElement(PASS_INPUT).sendKeys(password);
//        //Click in button
//        driver.findElement(BUTTON_INPUT).click();
//        //Check for url
//        String getUrl = driver.getCurrentUrl();
//        Assert.assertEquals(getUrl, mainURL);
//        //Click example
//        driver.findElement(DOJO_LINK).click();
//        //Check for url
//        String todoUrl = driver.getCurrentUrl();
//        Assert.assertEquals(todoUrl, todoURL);
//        //Create a To Do
//        driver.findElement(TODO_INPUT).sendKeys(first_todo);
//        WebElement.sendKeys(Keys.ENTER);
//        //Check if To Do created
//        driver.findElement(TODO_ITEM);
//        //Find out a way to compare this item with the one put in the input
//    }

    @Test
    // Ejecuting Test
    public void scenario5() {
        //Open Page
        driver.get(appURL);
        //Fill out input for user and password
        driver.findElement(USER_INPUT).sendKeys(user);
        driver.findElement(PASS_INPUT).sendKeys(password);
        //Click in button
        driver.findElement(BUTTON_INPUT).click();
        //Check for url
        String getUrl = driver.getCurrentUrl();
        Assert.assertEquals(getUrl, mainURL);
        //Click example
        driver.findElement(DOJO_LINK).click();
        //Check for url
        String todoUrl = driver.getCurrentUrl();
        Assert.assertEquals(todoUrl, todoURL);
        //Create a To Do List
        driver.findElement(TODO_INPUT).sendKeys(first_todo);
        driver.findElement(TODO_INPUT).sendKeys(second_todo);
//        WebElement webElement = driver.findElement();
//        webElement.sendKeys(Keys.ENTER);
        driver.findElement(TODO_INPUT).sendKeys(third_todo);
//        WebElement.sendKeys(Keys.ENTER);
        driver.findElement(TODO_INPUT).sendKeys(fourth_todo);
//        WebElement.sendKeys(Keys.ENTER);
        //Check if numbers are correct in every to do
        driver.findElement(TODO_ITEM);

    }
//
//    @Test
//    // Ejecuting Test
//    public void scenario6() {
//        //Open Page
//        driver.get(appURL);
//        //Fill out input for user and password
//        driver.findElement(USER_INPUT).sendKeys(user);
//        driver.findElement(PASS_INPUT).sendKeys(password);
//        //Click in button
//        driver.findElement(BUTTON_INPUT).click();
//        //Check for url
//        String getUrl = driver.getCurrentUrl();
//        Assert.assertEquals(getUrl, mainURL);
//        //Click example
//        driver.findElement(DOJO_LINK).click();
//        //Check for url
//        String todoUrl = driver.getCurrentUrl();
//        Assert.assertEquals(todoUrl, todoURL);
//        //Create a To Do List
//        driver.findElement(TODO_INPUT).sendKeys(first_todo);
//        Key.enter;
//        driver.findElement(TODO_INPUT).sendKeys(second_todo);
//        driver.findElement(TODO_INPUT).sendKeys(third_todo);
//        driver.findElement(TODO_INPUT).sendKeys(fourth_todo);
//        //Check if numbers are correct in every to do
//
//        //Delete half the to do list
//
//    }
    @AfterClass
    // Closing Browser when finish the test
    public void tearDown() {
        //driver.quit();
    }
}
