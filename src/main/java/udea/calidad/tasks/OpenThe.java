package udea.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import udea.calidad.interactions.BancolombiaHomePage;

public class OpenThe implements Task {

    private final PageObject page;

    public OpenThe(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(BancolombiaHomePage.go());
    }

    public static OpenThe Browser(PageObject page){
        return Tasks.instrumented(OpenThe.class,page);
    }
}
