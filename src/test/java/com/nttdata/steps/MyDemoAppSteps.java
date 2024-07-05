package com.nttdata.steps;

import com.nttdata.screens.DetailMyDemoAppScreen;
import com.nttdata.screens.MyDemoAppScreen;
import com.nttdata.screens.ShopCartMyDemoAppScreen;
import org.junit.Assert;

public class MyDemoAppSteps {
    MyDemoAppScreen myDemoAppScreen;
    DetailMyDemoAppScreen detailMyDemoAppScreen;
    ShopCartMyDemoAppScreen shopCartMyDemoAppScreen;

    public void validacionDeProductosCargadosEnLaGaleria() {
        Assert.assertEquals("Products", myDemoAppScreen.getTitulo());
        boolean presente = myDemoAppScreen.validarIconoVisible();
        Assert.assertTrue(presente);
        int productos = myDemoAppScreen.productosEnLaGaleria();
        Assert.assertTrue(productos > 0);
    }

    public void clicEnElProducto(String texto) {
        myDemoAppScreen.clicEnElProducto(texto);
    }

    public void clicEnElBotonMas(String arg0) {
        detailMyDemoAppScreen.clicEnElBotonMas(arg0);
    }

    public void clicEnElBotonAddCart() {
        detailMyDemoAppScreen.clicEnElBotonAddCart();
        detailMyDemoAppScreen.clicEnElBotonCar();
    }

    public void validarCarritoComprasElNombreYCantidad(String texto, String cantidad) {
        Assert.assertEquals(texto, shopCartMyDemoAppScreen.getTituloProducto());
        Assert.assertEquals(cantidad, shopCartMyDemoAppScreen.getCantidadProducto());
    }
}
