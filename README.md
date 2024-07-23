
#### Instrucciones de Ejecución

**1. Requisitos Previos:**

-   Java 17 instalado.
-   Gradle instalado.
-   Un IDE de su preferencia (IntelliJ IDEA, Eclipse, etc.).

**2. Clonar el Repositorio:**

-   Clone el repositorio del proyecto en su máquina local usando el siguiente comando:

    `git clone https://github.com/renzoserra/sauceDemo-aut.git`


**3. Importar el Proyecto:**

-   Importe el proyecto clonado en su IDE preferido como un proyecto de Gradle.

**4. Configuración del Navegador:**

-   El proyecto permite ejecutar las pruebas en Chrome, Firefox y Edge. Puede cambiar el navegador configurando la variable `String browser` que se encuentra en la clase Hooks.

**5. Ejecutar las Pruebas:**

-   Puede ejecutar las pruebas directamente desde el archivo `SauceDemo.feature` en su IDE.
-   Otra opción es ejecutar el Runner con alguno de los tags de la feature: `@E2E`, `@RutaCritica`, `@SauceDemo`.


**6. Ver los Reportes:**

-   Los reportes generados se encuentran en la carpeta `src/main/java/Reports/HtmlReport` y pueden ser visualizados abriendo el archivo `automationReport.html` en su navegador.

**Estructura del Proyecto:**

-   `src/test/java`: Contiene las clases de prueba y las páginas mapeadas utilizando POM.
-   `src/main/java/features`: Contiene los archivos de características (features)
-   `build.gradle`: Archivo de configuración de Gradle.

**Navegadores Soportados:**

-   Chrome
-   Firefox
-   Edge