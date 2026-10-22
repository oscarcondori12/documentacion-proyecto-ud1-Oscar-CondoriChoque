package es.centro.incidencias;

/**
 * Es una excepcion que se lanza cuando se intenta buscar un incidencia
 * que no exista en el programa
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Crea una excepcion indicando el identificador de la incidencia no encontrada
     * @param id el identificador de la incidencia que no se encontro
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
