package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DetailMyDemoAppScreen extends PageObject {
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement btnPlus;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement btnAddCart;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement btnCar;

    public void clicEnElBotonMas(String arg0) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(btnPlus));
        int num = Integer.parseInt(arg0);
        for (int i = 0; i < num - 1; i++) {
            btnPlus.click();
        }
    }


    public void clicEnElBotonAddCart() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(btnAddCart));
        btnAddCart.click();
    }

    public void clicEnElBotonCar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(btnCar));
        btnCar.click();
    }
}
