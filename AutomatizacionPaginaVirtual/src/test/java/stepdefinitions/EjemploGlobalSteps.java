package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.BuscarProducto;
import tasks.RegistrarUsuario;
import userinterfaces.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.HomePage.VALIDAR_CARRO;

public class EjemploGlobalSteps {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();


    @Dado("^que un cliente accede hasta la web de compras$")
    public void queUnClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
        navegador.manage().window().maximize();
    }


    @Cuando("^el agrega (.*) unidades de (.*) y (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion1, String descripcion2) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion1, descripcion2)
        );
    }

    @Entonces("^el ve los productos listados en el carro de compras$")
    public void elVeLosProductosListadosEnElCarroDeCompras() {

    }

    @Dado("^que un cliente requiere registrarse en el sistema$")
    public void queUnClienteRequiereRegistrarseEnElSistema() {

    }


    @Cuando("^el diligencia el formulario con los datos (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) ,(.*), (.*)$")
    public void elDiligenciaElFormularioConLosDatosDuvanPruebaPruebaComDuvanPedrazaCalleNewYorkNewYork(String correo, String nombre, String apellido, String contraseña, String direccion1, String ciudad, String estado, String codigo, String celular, String direccion2) {
        actor.wasAbleTo(
                RegistrarUsuario.conCorreo(correo, nombre, apellido, contraseña, direccion1, ciudad, estado, codigo, celular, direccion2)
        );
    }



    @Entonces("^el queda registrado en el sistema$")
    public void elQuedaRegistradoEnElSistema() {

    }

}
