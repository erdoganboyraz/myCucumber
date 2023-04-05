package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinations {
    GooglePage googlePage=new GooglePage();
    @Given("kullanıcı google a gider")
    public void kullanıcı_google_a_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    }
    @When("kullanıcı iphone için arama yapar")
    public void kullanıcı_iphone_için_arama_yapar() {
       googlePage.searchBox.sendKeys("iphone"+ Keys.ENTER);

    }
    @Then("sonuçlarda iphone olduğunu doğrular")
    public void sonuçlarda_iphone_olduğunu_doğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));

    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
    @When("kullanıcı tesla için arama yapar")
    public void kullanıcı_tesla_için_arama_yapar() {
        googlePage.searchBox.sendKeys("tesla"+ Keys.ENTER);

    }
    @Then("sonuçlarda tesla olduğunu doğrular")
    public void sonuçlarda_tesla_olduğunu_doğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tesla"));

    }


}
