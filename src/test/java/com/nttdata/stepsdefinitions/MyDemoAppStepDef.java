package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MyDemoAppSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyDemoAppStepDef {
    @Steps
    MyDemoAppSteps myDemoAppSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        myDemoAppSteps.validacionDeProductosCargadosEnLaGaleria();
    }

    @When("hago clic en el producto {string}")
    public void hagoClicEnElProducto(String arg0) {
        myDemoAppSteps.clicEnElProducto(arg0);
    }

    @And("agrego las unidades {string}")
    public void agregoLasUnidades(String arg0) {
        myDemoAppSteps.clicEnElBotonMas(arg0);
    }

    @And("hago clic en el boton {string}")
    public void hagoClicEnElBoton(String arg0) {
        myDemoAppSteps.clicEnElBotonAddCart();
    }

    @Then("valido el carrito de compra actualice correctamente el nombre {string} y la cantidad {string}")
    public void validoElCarritoDeCompraActualiceCorrectamenteElNombreYLaCantidad(String texto, String cantidad) {
        myDemoAppSteps.validarCarritoComprasElNombreYCantidad(texto, cantidad);
    }
}
