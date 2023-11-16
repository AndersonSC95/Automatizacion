package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static udea.calidad.userinterfaces.UsuarioPage.*;
//prueba final
public class SelectTv2 implements Interaction {
    private static final String TV = "LG Tv";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SEGUNDO_TV));
        actor.attemptsTo(Click.on(BOTON_CARRITO));
    }

    public static SelectTv2 Go() {
        return Tasks.instrumented(SelectTv2.class);
    }
}


