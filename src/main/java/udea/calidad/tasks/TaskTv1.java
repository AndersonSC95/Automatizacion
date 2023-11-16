package udea.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import udea.calidad.interactions.SelectTv1;
import udea.calidad.interactions.SelectTv2;

public class TaskTv1 implements Task {

    private final PageObject page;

    public TaskTv1(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(SelectTv1.go());
    }

    public static TaskTv1 info1 (PageObject page){
        return Tasks.instrumented(TaskTv1.class,page);
    }
}
