package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static udea.calidad.userinterfaces.UsuarioPage.*;
import static udea.calidad.userinterfaces.UsuarioPage.BUTTON_SIMULAR;

public class SimulationBancolombia implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPCION_SI));
        actor.attemptsTo(Enter.theValue("10000000").into(TEXT_INPUT));
        actor.attemptsTo(Enter.theValue("60").into(TEXT_INPUT1));
        actor.attemptsTo(Click.on(FECHA));
        actor.attemptsTo(Click.on(FECHA_ANNO));
        actor.attemptsTo(Click.on(FECHA_MES));
        actor.attemptsTo(Click.on(FECHA_DIA));
        actor.attemptsTo(Click.on(BUTTON_SIMULAR));
    }

    public static SimulationBancolombia infoGo(){
        return Tasks.instrumented(SimulationBancolombia.class);
    }
}
