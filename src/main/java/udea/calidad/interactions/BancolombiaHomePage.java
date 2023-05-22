package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static udea.calidad.userinterfaces.UsuarioPage.INPUT_TEXT_GOOGLE;
import static udea.calidad.userinterfaces.UsuarioPage.LINK_HOMEPAGE_BANCOLOMBIA;

public class BancolombiaHomePage implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Bancolombia").into(INPUT_TEXT_GOOGLE).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(LINK_HOMEPAGE_BANCOLOMBIA));
    }

    public static BancolombiaHomePage go(){
        return Tasks.instrumented(BancolombiaHomePage.class);
    }
}
