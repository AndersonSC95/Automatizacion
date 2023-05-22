package co.edu.udea.calidad.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import udea.calidad.questions.ValidacionBancolombia;
import udea.calidad.tasks.OpenThe;
import udea.calidad.userinterfaces.UsuarioPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class FindHomePageStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor usuario = Actor.named("Anderson");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de google")
    public void queMeEncuentroPaginaPrincipal(){
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("escriba la palabra Bancolombia")
    public void  escribaLaPalabraBancolombia(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @Then("puedo ver la pagina oficial")
    public void puedoVerElLinkOficial(){
        usuario.should(seeThat(ValidacionBancolombia.theHomePage(),equalTo(true)));
    }

}
