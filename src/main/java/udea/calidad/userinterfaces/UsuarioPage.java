package udea.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    public static final Target INPUT_TEXT_GOOGLE = Target.the("INPUT TEXT GOOGLE").locatedBy("//*[@id='APjFqb']");
   public static final Target LINK_HOMEPAGE_BANCOLOMBIA = Target.the("LINK BANCOLOMBIA").locatedBy("//*[@id='rso']/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");
    public static final Target TEXT_VALIDATION_BANCOLOMBIA = Target.the("TEXTO EN LA HOMEPAGE").locatedBy("//*[@id='home-conoce-mas-productos']/div/div[1]/h2");

}