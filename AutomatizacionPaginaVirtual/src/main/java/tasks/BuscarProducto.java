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

public class BuscarProducto implements Task{

    private String descripcion1;
    private String descripcion2;
    public BuscarProducto(String descripcion1, String descripcion2){
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Diligenciamos los campos con la información que traemos
                Enter.theValue(descripcion1).into(INPUT_BUSCAR_OBJETO), //diligencia el campo de busqueda
                Hit.the(Keys.ENTER).into(BUTTON_BUSCAR_OBJETO), //da enter para buscar
                Click.on(SELECCIONAR),
                Click.on(INPUT_SELECCIONAR_PRENDA),//selecciona el producto
                Click.on(BUTTON_CONTINUAR_COMPRA),//Se devuelve para seguir comprando
                Enter.theValue(descripcion2).into(INPUT_BUSCAR_OBJETO), //diligencia el campo de busqueda
                Hit.the(Keys.ENTER).into(BUTTON_BUSCAR_OBJETO), //da enter para buscar
                Click.on(BUTTON_SELECCIONAR_COLOR),//selecciona el color de la prenda
                Click.on(BUTTON_SELECCIONAR_COLOR),//selecciona el color de la prenda
                Click.on(BUTTON_MÁS_PRODUCTO),// Sumamos 1 producto
                Click.on(BUTTON_AGREGAR_PRODUCTO),//Agregamos al carrito
                Click.on(BUTTON_IR_AL_CARRITO),//Nos lleva al carrito 1. Summary
                Click.on(BUTTON_IR_OPC_2)//Nos lleva al carrito 1. Summary



        );
    }

    public static BuscarProducto conDescripcion(String descripcion1, String descripcion2) {
        return instrumented(BuscarProducto.class, descripcion1, descripcion2);
    }
}
