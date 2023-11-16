package udea.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import udea.calidad.interactions.SelectTv1;
import udea.calidad.interactions.SelectTv2;

public class TaskTv2 implements Task {

    private final PageObject page;
	//PRUEBAS
    public TaskTv2(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectTv2.Go());
    }

    public static TaskTv2 info2 (PageObject page){
        return Tasks.instrumented(TaskTv2.class,page);
    }
}
