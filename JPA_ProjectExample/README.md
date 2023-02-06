# JPA - Maven - MySQL - NetBeans

El proyecto que se presenta aquí está diseñado para demostrar cómo se puede implementar una solución de persistencia de datos utilizando **Java Persistence API (JPA)**, **Maven** como gestor de dependencias y construcción, **MySQL** como motor de base de datos y **NetBeans** como entorno de desarrollo integrado (IDE).

**JPA** es una especificación de Java que proporciona un marco de trabajo para la gestión de entidades de persistencia y la persistencia de datos en una base de datos relacional. **Maven** es una herramienta de construcción y gestión de dependencias que permite descargar y administrar las bibliotecas necesarias para el proyecto. **MySQL** es un motor de base de datos relacional de código abierto y ampliamente utilizado. **NetBeans** es un IDE gratuito que brinda una amplia gama de características y herramientas para el desarrollo de aplicaciones Java.

El objetivo de este proyecto es crear una aplicación que permita a los usuarios almacenar, acceder y actualizar información en una base de datos **MySQL** utilizando **JPA** y **Maven**. La aplicación será desarrollada en **NetBeans** y se utilizará para demostrar cómo se puede integrar **JPA**, **Maven**, **MySQL** y **NetBeans** para crear una solución de persistencia de datos eficiente y fácil de mantener.

## Configuración

1. **Instalar NetBeans:** Descarga e instala la última versión de NetBeans desde la página oficial.

2. **Instalar MySQL:** Descarga e instala MySQL en tu sistema. Crea una base de datos y establece un usuario y contraseña.

3. **Crear un nuevo proyecto Maven en NetBeans:** Abre NetBeans y selecciona "File" -> "New Project" y luego selecciona "Maven" -> "Java Application". Sigue los pasos para crear un nuevo proyecto y especifique el nombre y la ubicación del proyecto.

<div align="center">
<img src="https://user-images.githubusercontent.com/40324908/217112492-f1a54510-0273-443c-9317-4dd2cc1fbfc7.PNG" alt="1">
</div>

4. **Añadir el driver de MySQL:** Haz clic en la pestaña "Dependencies" -> Haz clic en el botón "Add Dependency" -> En la ventana "Add Dependency", escribe el nombre de la dependencia que deseas agregar en el campo de búsqueda, en este caso será **(MySQL connector)** -> Selecciona la dependencia que deseas agregar de la lista de resultados -> Haz clic en "Add" para agregar la dependencia a tu proyecto -> Guarda los cambios y haz clic direcho sobre el folder del "Proyecto", luego selecciona "Clean and Build".

<div align="center">
<img src="https://user-images.githubusercontent.com/40324908/217112751-d5ae5f7c-cd73-479e-93c3-7d92219ab489.PNG" alt="2">
</div>

5. **Crear una nueva conexión:** En NetBeans y selecciona "Services" -> "Databases" y luego da clic derecho y selecciona "New Connection" -> Selecciona "New Driver" en el cuadro "Driver" y haz clic en "Add" -> Aparecerá una ventana donde debemos bucar el driver de MySQL que se encuentra en la siguiente ruta "C:\Users\nombreUsuario\.m2\repository\mysql\mysql-connector-java" -> Dar clic en "Open" -> Luego en "Ok"  -> y por ultimo en "Next".

<div align="center">
<img src="https://user-images.githubusercontent.com/40324908/217112871-02f539ce-ceff-4a17-8628-7855e1a8e34f.PNG" alt="3">
</div>

6. **Datos de conexión de la BD:** En este paso, se deben agregar los datos necesarios para la optima conexión a la base de datos que ya debe estar previamente creada -> En el apartado "JDBC URL" agregamos lo siguiente y probamos la conexión: 

```bash
  jdbc:mysql://localhost:3306/nombreBD?useSSL=false&useTimezone=true&serverTimezone=UTC
```

<div align="center">
<img src="https://user-images.githubusercontent.com/40324908/217113054-1580ac1b-d6aa-49cd-8e50-86b7492f177a.PNG" alt="4">
</div>

7. **Creación archivo de persistencia:** Para este proyecto se utilizará el **Modelo de Capas**, por ende, se crearan los paquetes correspondientes, **"UI - Lógica - Persistencia - DAO"**, se creará el archivo de persistencia al cual se le añadirá un nombre y se le agregará la conexión a la base de datos. 

<div align="center">
<img src="https://user-images.githubusercontent.com/40324908/214440337-6feccc6a-5b60-4817-ad7d-eb86c18b4ecb.PNG" alt="Install_3">
</div>

<div align="center">
<img src="https://user-images.githubusercontent.com/40324908/214440337-6feccc6a-5b60-4817-ad7d-eb86c18b4ecb.PNG" alt="Install_3">
</div>
