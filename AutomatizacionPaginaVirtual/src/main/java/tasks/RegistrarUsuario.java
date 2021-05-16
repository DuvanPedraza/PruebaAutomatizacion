package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class RegistrarUsuario implements Task{

    private String correo ;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String direccion1;
    private String ciudad;
    private String estado;
    private String codigo;
    private String celular;
    private String direccion2;
    public RegistrarUsuario(String correo, String nombre, String apellido, String contraseña, String direccion1, String ciudad, String estado,String codigo, String celular, String direccion2){
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.direccion1 = direccion1;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigo = codigo;
        this.celular = celular;
        this.direccion2 = direccion2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Diligenciamos los campos con la información que traemos
                Enter.theValue(correo).into(INGRESAR_CORREO), //diligencia el campo de busqueda
                Click.on(BUTTON_CREAR_CUENTA),//Da clic en el botón crear cuenta
                Click.on(RADIO),//Da clic en el botón crear cuenta
                Enter.theValue(nombre).into(NOMBRE), //diligencia el campo de nombre
                Enter.theValue(apellido).into(APELLIDO), //diligencia el campo de apellido
                Enter.theValue(contraseña).into(CLAVE), //diligencia el campo de contraseña
                Enter.theValue(direccion1).into(DIRECCION), //diligencia el campo de direccion
                Enter.theValue(ciudad).into(CIUDAD), //diligencia el campo de ciudad
                SelectFromOptions.byVisibleText(estado).from(ESTADO), //diligencia el campo de estado
                Enter.theValue(codigo).into(CODIGO_POSTAL), //diligencia el campo de codigo postal
                Enter.theValue(celular).into(NUMERO), //diligencia el campo de celular
                Enter.theValue(direccion2).into(REFERENCIA), //diligencia el campo de referencia
                Click.on(BOTON_REGISTRAR),//Da clic en el botón registrar
                Click.on(BOTON_CHECKOUT),//Da clic en el botón check out
                Click.on(BOTON_ACEPTAR),//Da clic en el botón aceptar terminos y condiciones
                Click.on(BOTON_CARRIER),//Da clic en el botón carrier
                Click.on(BOTON_BANCO),//Da clic en el botón banco wiref
                Click.on(CONFIRMAR_COMPRA),//Da clic en el botón confirmar compra
                Click.on(VER_ORDENES),//Da clic en el botón ver ordenes
                Click.on(DETALLE)//Da clic en el botón detalle

        );
    }

    public static RegistrarUsuario conCorreo(String correo, String nombre, String apellido, String contraseña, String direccion1, String ciudad, String estado, String codigo, String celular, String direccion2) {
        return instrumented(RegistrarUsuario.class, correo, nombre, apellido, contraseña, direccion1, ciudad, estado, codigo, celular, direccion2);
    }
}