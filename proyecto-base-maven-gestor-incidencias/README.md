# Gestor de Incidencias


Nombre: Gestor de Incidencias

Finalidad: Consultar las incidencias de soporte del centro desde la consola

Descripción: Aplicación sencilla que permite ver las incidencias, filtrar las abiertas, buscar por texto y consultar una por su id. Los datos están metidos a mano en el codigo

Versión de Java: Java 17 o superior

Funcionalidades:
- Ver todas las incidencias
- Ver solo las que están abiertas
- Buscar por id o por título (no distingue mayúsculas)
- Consultar una incidencia concreta por su id
- Se puede usar con menú o con comandos

Estructura de archivos:
es/centro/incidencias/
- App.java
- GestorIncidencias.java
- Incidencia.java
- IncidenciaNoEncontradaException.java

Compilación y ejecución:

Para compilar:
javac es/centro/incidencias/*.java

Para ejecutar el menú:
java es.centro.incidencias.App

También se puede ejecutar pasando comandos (ayuda, listar, abiertas, buscar , detalle).

Generación y consulta de Javadoc:

Para generar la documentación:

en tools del IDEA project, creas una carpeta de DOCS y ya te mete toda la informacion ahi

Documentación publicada:  https://oscarcondori12.github.io/documentacion-proyecto-ud1-Oscar-CondoriChoque/proyecto-base-maven-gestor-incidencias/docs/


Clases principales:
App - Punto de entrada, menú y comandos
GestorIncidencias - Gestiona la lista de incidencias y las búsquedas
Incidencia - Representa una incidencia
IncidenciaNoEncontradaException - Se lanza cuando no existe el id que buscas