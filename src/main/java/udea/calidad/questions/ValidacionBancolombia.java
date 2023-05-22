package udea.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static udea.calidad.userinterfaces.UsuarioPage.TEXT_VALIDATION_BANCOLOMBIA;


public class ValidacionBancolombia implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXT_VALIDATION_BANCOLOMBIA).viewedBy(actor).asString();
        if(stringTemporal.contains("de nuestros productos")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidacionBancolombia theHomePage(){return new ValidacionBancolombia();}
}
