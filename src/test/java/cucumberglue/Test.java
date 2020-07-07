package cucumberglue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver;

    @Given("^El usuario se encuentra en la pagina de Home imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_de_Home_imalittletester() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @When("^Hace click sobre el boton de The little tester comics$")
    public void hace_click_sobre_el_boton_de_The_little_tester_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement itemLocation = driver.findElement(By.id("menu-item-2008"));
        itemLocation.click();

    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement pageTitle = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirecciono bien a la pagina de Comics", pageTitle.isDisplayed());
        Assert.assertEquals("Category: comics", pageTitle.getText());

    }

}
