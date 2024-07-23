
#### Conclusiones

**1. Flujo de Compra en SauceDemo:**

-   La prueba automatizada cubre todo el flujo de compra, desde la autenticación hasta la confirmación del pedido.
-   Se validó correctamente la navegación entre las diferentes páginas del proceso de compra.
-   Se realizaron todas las validaciones necesarias para asegurar que los elementos requeridos aparezcan en la pantalla y que las interacciones funcionen como se espera.

**2. Uso de POM (Page Object Model):**

-   La implementación del patrón POM facilita la mantenibilidad y la reutilización del código.
-   La separación de responsabilidades en diferentes clases mejora la claridad y la estructura del proyecto.

**3. Automatización del Manejo de Drivers:**

-   Se utilizó la librería `io.github.bonigarcia:webdrivermanager` para gestionar los drivers de los navegadores, eliminando la necesidad de configuraciones manuales y mejorando la portabilidad del proyecto.

**4. Reportería:**

-   La implementación de `tech.grasshopper:extentreports-cucumber7-adapter` permite generar reportes detallados de las ejecuciones, proporcionando información valiosa sobre el estado de las pruebas.

**5. Ejecución en Múltiples Navegadores:**

-   El proyecto está configurado para ejecutarse en los navegadores Chrome, Firefox y Edge, lo cual amplía la cobertura y garantiza la compatibilidad con diferentes entornos de usuarios.