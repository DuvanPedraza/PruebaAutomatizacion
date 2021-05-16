package userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject{

    //Tomamos el identificador de cada campo a usar
    public static final Target INPUT_BUSCAR_OBJETO = Target.the("Input de busqueda").located(By.id("search_query_top"));
    public static final Target BUTTON_BUSCAR_OBJETO = Target.the("Lupa de busqueda").located(By.className("button-search"));
    public static final Target INPUT_SELECCIONAR_PRENDA = Target.the("Agregar al carrito pagina principal").locatedBy("//a[starts-with(@title,'Add to cart')]");
    public static final Target BUTTON_CONTINUAR_COMPRA = Target.the("Continuar Compra").located(By.className("continue"));
    public static final Target BUTTON_SELECCIONAR_COLOR = Target.the("Selecciona el color").locatedBy("//a[starts-with(@id,'color_20')]");
    public static final Target BUTTON_MÁS_PRODUCTO = Target.the("Suma la cantidad de un producto").located(By.className("product_quantity_up"));
    public static final Target BUTTON_AGREGAR_PRODUCTO = Target.the("Agrega al carro desde pagina del producto").located(By.id("add_to_cart"));
    public static final Target BUTTON_IR_AL_CARRITO = Target.the("Ir Al Carrito").locatedBy("//a[starts-with(@title,'Proceed to checkout')]");
    public static final Target BUTTON_IR_OPC_2 = Target.the("Ir Al Carrito").located(By.className("standard-checkout"));
    public static final Target VALIDAR_CARRO = Target.the("Se Valida que tenga los productos").located(By.id("cart_summary"));
    public static final Target INGRESAR_CORREO = Target.the("Se ingresa al Correo").locatedBy("//input[starts-with(@id,'email_create')]");
    public static final Target BUTTON_CREAR_CUENTA = Target.the("Dar clic boton crear cuenta").located(By.id("SubmitCreate"));
    public static final Target SELECCIONAR = Target.the("Da clic el stock").located(By.className("availability"));
    public static final Target RADIO = Target.the("Selecciona el Radio Button").located(By.id("uniform-id_gender1"));
    public static final Target NOMBRE = Target.the("Ingresa el nombre").located(By.id("customer_firstname"));
    public static final Target APELLIDO = Target.the("Ingresa el apellido").located(By.id("customer_lastname"));
    public static final Target CLAVE = Target.the("Ingresa la clave").located(By.id("passwd"));
    public static final Target DIRECCION = Target.the("campo direccion").located(By.id("address1"));
    public static final Target CIUDAD = Target.the("campo ciudad").located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("campo codigo postal").located(By.id("postcode"));
    public static final Target ESTADO = Target.the("campo estado").located(By.id("id_state"));
    public static final Target NUMERO = Target.the("campo número").located(By.id("phone_mobile"));
    public static final Target REFERENCIA = Target.the("campo referencia").located(By.id("alias"));
    public static final Target BOTON_REGISTRAR = Target.the("Ingresa el día").located(By.id("submitAccount"));
    public static final Target BOTON_CHECKOUT = Target.the("boton check out").located(By.name("processAddress"));
    public static final Target BOTON_ACEPTAR = Target.the("boton aceptar tyc").located(By.id("uniform-cgv"));
    public static final Target BOTON_CARRIER = Target.the("boton carrier").located(By.name("processCarrier"));
    public static final Target BOTON_BANCO = Target.the("Boton banco").located(By.className("bankwire"));
    public static final Target CONFIRMAR_COMPRA = Target.the("Boton confrimar compra").locatedBy("//button[starts-with(@class,'button btn btn-default button-medium')]");
    public static final Target VER_ORDENES = Target.the("Botoón ver ordenes").located(By.className("button-exclusive"));
    public static final Target DETALLE = Target.the("Botón ver detalles").locatedBy("//a[starts-with(@class,'color-myaccount')]");
}
