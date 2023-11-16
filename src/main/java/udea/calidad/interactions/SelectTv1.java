package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static udea.calidad.userinterfaces.UsuarioPage.*;

public class SelectTv1 implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRIMER_TV));
        actor.attemptsTo(Click.on(BOTON_CARRITO));
    }

    public static SelectTv1 go(){
        return Tasks.instrumented(SelectTv1.class);
    }
}
