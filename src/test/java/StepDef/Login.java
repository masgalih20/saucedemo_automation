package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("I open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir  = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @And("Open website saucedemo")
    public void openWebsiteSaucedemo() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
    }

    @And("Located on saucedemo website")
    public void locatedOnSaucedemoWebsite() {
        driver.findElement(By.name("login-button")).isDisplayed();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    }

    @Then("I go to homepage")
    public void iGoToHomepage() {
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed();
//        driver.close();
//        driver.quit();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        driver.findElement(By.name("user-name")).sendKeys("user123");
    }

    @Then("I stay on login page")
    public void iStayOnLoginPage() {
        driver.findElement(By.name("login-button")).isDisplayed();
    }

    @When("I click add to cart button")
    public void iClickAddToCartButton() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    @And("I click cart button")
    public void iClickCartButton() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    @And("I click checkout button")
    public void iClickCheckoutButton() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    @Then("I go to checkout page")
    public void iGoToCheckoutPage() {
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).isDisplayed();
    }

    @When("I input the first name")
    public void iInputTheFirstName() {
        driver.findElement(By.name("firstName")).sendKeys("Galih");
    }

    @And("I input the last name")
    public void iInputTheLastName() {
        driver.findElement(By.name("lastName")).sendKeys("Anggriawan");
    }

    @And("I input the postal code")
    public void iInputThePostalCode() {
        driver.findElement(By.name("postalCode")).sendKeys("12345");
    }

    @And("I click continue button")
    public void iClickContinueButton() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    @And("I click finish button")
    public void iClickFinishButton() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }

    @Then("Checkout product completed")
    public void checkoutProductCompleted() {
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).isDisplayed();
    }

    @When("I click sort button")
    public void iClickSortButton() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
    }

    @And("I click Name \\(Z to A)")
    public void iClickNameZToA() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
    }

    @Then("The last product is on the top")
    public void theLastProductIsOnTheTop() {
        driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).isDisplayed();
    }
}
