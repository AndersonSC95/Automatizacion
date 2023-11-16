package udea.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import udea.calidad.interactions.NavAmazon;

public class BuscarFiltrar implements Task {

    private final PageObject page;

    public BuscarFiltrar(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(NavAmazon.go());
    }

    public static BuscarFiltrar busqueda(PageObject page){
        return Tasks.instrumented(BuscarFiltrar.class,page);
    }
}
