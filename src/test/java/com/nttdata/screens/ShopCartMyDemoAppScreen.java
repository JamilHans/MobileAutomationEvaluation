package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopCartMyDemoAppScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement titleProduct;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/noTV")
    private WebElement cantidadProduct;

    public String getTituloProducto() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(titleProduct));
        return titleProduct.getText();
    }

    public String getCantidadProducto() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(cantidadProduct));
        return cantidadProduct.getText();
    }
}
