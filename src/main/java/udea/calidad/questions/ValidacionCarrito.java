package udea.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static udea.calidad.userinterfaces.UsuarioPage.CARRITO;


public class ValidacionCarrito implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        String stringTemporal = Text.of(CARRITO).viewedBy(actor).asString();
        if(stringTemporal.contains("2")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidacionCarrito theHomePage(){return new ValidacionCarrito();}
}
