package es.centro.incidencias;

import java.util.List;

/**
 * * Gestiona una coleccion de memoria de varios objetos {@link Incidencia}
 *
 * <p>Permite mostrar las incidencias, abrir incidencias si hay alguna incidencias
 *  , permite buscar las incidencias por su nombre, tambien por id de la incidencia.</p>
 */
public final class  GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Una lista de tareas ya hechas  y que carga incidencias inciiales del sistema
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Devuelve una vista de todas las incidencias
     * @return todas las incidencias que estan dentro de la clase Incidencia.
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Devuelve una lista de incidencias que quedaron abiertas o que estan abiertas
     *
     * @return una lista de incidencias mediante un filtro para ver si estan abiertas o no
     */

    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }


    /**
     * Buscar una incidencia
     *
     * @param texto Texto a ingresar para buscar la incidencai
     * @return incidencia encontrada y que te lo muestre
     */

    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }


    /**
     *Busca una incidencia por su identificador
     *
     * @param id identificador buscado
     * @return incidencia encontrada o {@throws} muestra un mensaje diciendo q no existe
     * @throws IncidenciaNoEncontradaException muestra "No existe ninguna incidencia con el identificador"
     * @see Incidencia#getId()
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }


    /**
     * Filtra las incidencias cuyo id coincida con el que le pases tu (ignorando las mayusculas y minusculas)
     *
     * @param id identificador buscado
     * @return un objeto Indicencia si lo encuentra o {@code null} si no encuentra nada
     *
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
