@MyDemoApp
Feature: My Demo App

  @ShopOK
  Scenario Outline: Carrito de compras OK
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When hago clic en el producto "<PRODUCTO>"
    And agrego las unidades "<UNIDADES>"
    And hago clic en el boton "Add to cart"
    Then valido el carrito de compra actualice correctamente el nombre "<PRODUCTO>" y la cantidad "<UNIDADES>"
    Examples:
      | PRODUCTO                | UNIDADES |
      | Sauce Labs Backpack     | 1        |
      | Sauce Labs Bolt T-Shirt | 1        |
      | Sauce Labs Bike Light   | 2        |



