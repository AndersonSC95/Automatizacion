package co.edu.udea.calidad.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import udea.calidad.questions.ValidacionCarrito;
import udea.calidad.tasks.BuscarFiltrar;
import udea.calidad.tasks.TaskTv1;
import udea.calidad.tasks.TaskTv2;
import udea.calidad.userinterfaces.UsuarioPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class SimulationPageStepDefinition {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor usuario = Actor.named("Joan");

    @Before
    public void preStage() {
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("dado que estoy en la pagina de Amazon")
    public void meEncuentroPaginaPrincipal(){
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("escribo \"LG Tv\" en la barra de busqueda")
    public void  navegacionHomePageBancolombia(){
        usuario.attemptsTo(BuscarFiltrar.busqueda(new UsuarioPage()));
    }

    @And("seleciono el primer tv")
    public void  seleccionTv1(){
        usuario.attemptsTo(TaskTv1.info1(new UsuarioPage()));
    }

    @And("seleciono el segundo tv")
    public void  seleccionTv2(){
        usuario.attemptsTo(BuscarFiltrar.busqueda(new UsuarioPage()));
        usuario.attemptsTo(TaskTv2.info2(new UsuarioPage()));
    }
    @Then("se muestra correctamente la seleccion de productos en el carrito de compras")
    public void seMuestra(){
        usuario.should(seeThat(ValidacionCarrito.theHomePage(),equalTo(true)));
    }

}
