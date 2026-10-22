package es.centro.incidencias;

import java.util.Locale;


/**
 * Representa una incidencia a la que puede ser buscada  por su Id
 *
 *
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;


    /**
     * Crea una incidencia pendiente
     * @param id identificador de la incidencia y unico de la incidencia
     * @param titulo titulo descriptivo de la incidencia
     * @param prioridad prioridad de la incidencia mendiante texto
     * @param abierta booleando que dice si esta abierta o no
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }


    /**
     * Devuelve el identificador de la incidencia
     *
     * @return identificador de la incidencia
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el titulo de la incidencia
     *
     * @return titulo de la incidencia
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve la prioridad de la incidencia
     * @return la prioridad de la incidencia
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Devuelve si la incidencia esta abierta o no
     * @return devuelve true o false dependiendo de si esta abierta la incidencia o no
     */

    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si la incidencia coincide con el critere indiciado de busqueda
     * la comprobacion se hace tanto con mayusculas y minusculas
     * con el ID y el titulo fe la incidencia
     * @param texto texto a buscar en el id o en el titulo
     * @return true si el id o el titulo contiene el texto indicado y false cuando no
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
