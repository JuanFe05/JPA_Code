## JPA (Java Persistence API)

Es una **API** de persistencia de datos para **Java** que proporciona un marco de trabajo para la gestión de **entidades** y la persistencia de datos en una base de datos relacional. **JPA** facilita la integración de aplicaciones **Java** con una base de datos, proporcionando una forma estándar de acceder, actualizar y persistir datos en la base de datos. **JPA** es un estándar de persistencia de Java y es compatible con varios proveedores de implementación, como Hibernate, EclipseLink, etc.

## EclipseLink 

**EclipseLink** es una implementación de la **Java Persistence API (JPA)** y un **framework** de **mapeo objeto-relacional (ORM)** para Java. **EclipseLink** proporciona una solución de persistencia de datos que permite a los desarrolladores trabajar con entidades Java y bases de datos relacionales. Con **EclipseLink**, los desarrolladores pueden utilizar la **API JPA** para acceder, actualizar y persistir datos en una base de datos, sin tener que escribir código **SQL explícito**. **EclipseLink** es una de las implementaciones de **JPA** más populares y soporta una amplia variedad de bases de datos relacionales, incluyendo **Oracle**, **MySQL**, **SQL Server** y **PostgreSQL**.

## Arquitectura en Capas

La arquitectura en capas consta en dividir la aplicación en capas, con la intención de que cada capa tenga un rol muy definido, como podría ser, una capa de presentación **(UI)**, una capa de reglas de negocio **(servicios)** y una capa de acceso a datos **(DAO)**, sin embargo, este estilo arquitectónico no define cuantas capas debe de tener la aplicación, sino más bien, se centra en la separación de la aplicación en capas.

En la práctica, la mayoría de las veces este estilo arquitectónico es implementado en 4 capas, **presentación**, **negocio**, **persistencia** y **base de datos**, sin embargo, es habitual ver que la capa de negocio y persistencia se combinan en una solo capa, sobre todo cuando la lógica de persistencia está incrustada dentro de la capa de negocio.

## Data Access Object (DAO)

El objetivo principal de **DAO** es aislar la lógica de acceso a datos de la lógica de negocios de la aplicación, permitiendo que la lógica de negocios se concentre en las tareas relacionadas con el negocio y la lógica de acceso a datos se encargue de las tareas relacionadas con la persistencia de datos.

**DAO** es una clase que se encarga de realizar operaciones **CRUD (Create, Read, Update, Delete)** en una base de datos y proporciona una interfaz para acceder a los datos de una manera abstracción y separada de la implementación específica de la base de datos. Esto permite a los desarrolladores cambiar la implementación de la base de datos sin afectar la lógica de negocios de la aplicación.

El patrón **DAO** es muy útil para mejorar la escalabilidad, la mantenibilidad y la flexibilidad de una aplicación y puede ser una parte integral de la arquitectura en capas.
