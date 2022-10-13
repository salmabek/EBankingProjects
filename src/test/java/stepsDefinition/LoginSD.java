package stepsDefinition;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
    private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://demo.guru99.com/v3/index.php");

    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("user enters username and password");
        loginPage.setUserName("admin");
        loginPage.setPassword("admin");

    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        System.out.println("user clicks on Login button");
        loginPage.clickSubmit();

    }

    @Then("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        System.out.println("user gets the title of the page");
    }

}
