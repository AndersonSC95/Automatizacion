package udea.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    public static final Target BARRA_NAVEGACION = Target.the("BARRA DE NAVEGACION").locatedBy("//*[@id=\"twotabsearchtextbox\"]");
    public static final Target LUPA = Target.the("LUPA").locatedBy("//*[@id=\"nav-search-bar-form\"]/div[4]");
    public static final Target FILTRO = Target.the("FILTRO").locatedBy("//*[@id=\"search\"]/span[2]/div/h1/div/div[4]/div/div/form");
    public static final Target FILTRO_OP = Target.the("FILTRO OP4").locatedBy("//*[@id=\"s-result-sort-select\"]/option[5]");
    public static final Target PRIMER_TV = Target.the("PRIMER TV SELECCIONADO").locatedBy("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img");
    public static final Target SEGUNDO_TV = Target.the("SEGUNDO TV SELECCIONADO").locatedBy("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img");

    public static final Target BOTON_CARRITO = Target.the("BOTON AGREPAR CARRITO").locatedBy("//*[@id=\"add-to-cart-button\"]");

    public static final Target CARRITO = Target.the("CARRITO").locatedBy("//*[@id=\"nav-cart-count\"]");
}