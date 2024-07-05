package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class MyDemoAppScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement texto;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private WebElement imagen;

    @AndroidFindBy(id = "//android.widget.ImageView[@content-desc=\"App logo and name\"]")
    private WebElement icono;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Scrollview manages views in given screen size\"]/android.view.ViewGroup")
    private List<WebElement> lista;

    public String getTitulo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")));
        WebElement titulo2 = getDriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]"));
        return titulo2.getText();
    }

    public void clicEnElProducto(String texto) {
        String xpath = String.format("//android.widget.ImageView[@content-desc='%s']", texto);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement imagen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        imagen.click();
    }

    public boolean validarIconoVisible() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"App logo and name\"]")));
            return elemento.isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    public int productosEnLaGaleria() {
        return lista.size();
    }
}
