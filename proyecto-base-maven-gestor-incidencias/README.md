### Gestor de incidencias

### Proposito del programa

Ver todas las incidencias
- Ver solo las que están abiertas
- Buscar por texto (busca en el id y en el título, ignora mayúsculas)
- Consultar una incidencia concreta por su identificador
- Menú interactivo o ejecución por comandos

## Requisitos

Tener java 17 como minimo

## Estructura del proyecto

src/main/java/es.centro.incidencias
├── App.java
├── GestorIncidencias.java
├── Incidencia.java
└── IncidenciaNoEncontradaException.java

## Compilación y ejecución

### Compilar
Desde la carpeta donde esté el paquete:

`bash
javac es/centro/incidencias/*.java

### Menú interactivo


Si lo lanzas sin argumentos pues sale el menu:



 `ayuda`     | Muestra la ayuda                              
 `listar`    | Muestra todas las incidencias                 
 `abiertas`  | Solo las que están abiertas                   
`buscar`    | Busca por id o por título (ignora mayúsculas) 
 `detalle`   | Muestra una incidencia por su id   

## Incidencias de ejemplo

Hay 4 metidas a mano:

- INC-001 → No se puede iniciar sesión (alta, abierta)
- INC-002 → Actualizar el navegador (media, cerrada)
- INC-003 → Impresora sin conexión (baja, abierta)
- INC-004 → Fallo de red en el aula (alta, abierta)