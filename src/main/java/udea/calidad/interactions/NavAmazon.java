package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static udea.calidad.userinterfaces.UsuarioPage.*;

public class NavAmazon implements Interaction{

    private static final String TV = "LG Tv";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(TV).into(BARRA_NAVEGACION));
        actor.attemptsTo(Click.on(LUPA));
        actor.attemptsTo(Click.on(FILTRO));
        actor.attemptsTo(Click.on(FILTRO_OP));
    }

    public static NavAmazon go(){
        return Tasks.instrumented(NavAmazon.class);
    }
}
