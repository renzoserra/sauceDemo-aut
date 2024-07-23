#  Ejercicio:
#  Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en
#  la página
#  https://www.saucedemo.com/ que incluya:
#
#  . Autenticarse con el usuario: standard_user y password: secret_sauce
#  · Agregar dos productos al carrito
#  . Visualizar el carrito
#  . Completar el formulario de compra
#  . Finalizar la compra hasta la confirmacion: "THANK YOU FOR YOUR ORDER"Ejercicio:
#  Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en
#  la página
#  https://www.saucedemo.com/ que incluya:
#
#  . Autenticarse con el usuario: standard_user y password: secret_sauce
#  · Agregar dos productos al carrito
#  . Visualizar el carrito
#  . Completar el formulario de compra
#  . Finalizar la compra hasta la confirmacion: "THANK YOU FOR YOUR ORDER"

Feature: Flujo de compra en sitio sauce demo

  @E2E @RutaCritica
  Scenario: Validar flujo de compra en la web
    Given Ingreso a la web "https://www.saucedemo.com/"
    When  Ingreso credenciales validas "standard_user" y "secret_sauce"
    And   Hago click en el boton login
    Then  Visualizo que estoy en la web con el endpoint "inventory"
    And   Visualizo titulo seccion "Products"
    And   Agrego "2" productos al azar carrito de compras
    And   Hago click en el boton del carrito
    And   Visualizo que estoy en la web con el endpoint "cart"
    And   Visualizo titulo seccion "Your Cart"
    And   Valido que carrito contiene "2" productos en el carrito
    And   Hago click en el boton "Checkout"
    And   Visualizo que estoy en la web con el endpoint "checkout-step-one"
    And   Visualizo titulo seccion "Checkout: Your Information"
    And   Ingreso "Renzo" en el campo "First Name"
    And   Ingreso "Serra" en el campo "Last Name"
    And   Ingreso "210000" en el campo "Zip/Postal Code"
    And   Hago click en el boton "Continue"
    And   Visualizo que estoy en la web con el endpoint "checkout-step-two"
    And   Visualizo titulo seccion "Checkout: Overview"
    And   Hago click en el boton "Finish"
    And   Visualizo que estoy en la web con el endpoint "checkout-complete"
    And   Visualizo titulo seccion "Checkout: Complete!"
    And   Valido texto de finalizacion de compra "Thank you for your order!"




