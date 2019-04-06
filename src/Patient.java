/**
 * Clase patient
 *
 * @author Isabel Ortiz 18176
 * @author Diego Estrada 18540
 */
public class Patient implements Comparable<Patient> {
    // Atributos utilizados
    private String name;
    private String description;
    private String codde;

    /**
     *Constructor
     * @param name nombre del paciente
     * @param description descripcion
     * @param codde codigo del paciente
     */
    public Patient(String name, String description, String codde) {
        this.name = name;
        this.description = description;
        this.codde = codde;
    }

    /**
     * Este metodo edita el toString
     * @return un STring ordenado
     */
    @Override
    public String toString() {

        return this.getNombre() + " |  " + this.getDescription() + " | " + this.getCodde();
    }

    /**
     * Compara los codigos de emergencia
     * @param p un paciente
     * @return un int
     */
    @Override
    public int compareTo(Patient p) {
        return this.getCodde().compareTo(p.getCodde());
    }

    /**
     * Se hace un get del nombre del paciente
     * @return un String
     */
    public String getNombre() {
        return name;
    }
    /**
     * Se hace un set del nombre
     * @param name un string con el nombre
     */
    public void setNombre(String name) {
        this.name = name;
    }

    /**
     * Se obtiene el codigo
     * @return un string
     */
    public String getCodde() {
        return codde;
    }


    /***
     * Se le hace un get a la descripcion
     * @return string
     */
    public String getDescription() {
        return description;
    }

    /**
     * Se le hace set a la descripcion
     * @param description un string
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Se le hace un set al codde
     * @param codde es un string
     */
    public void setCodde(String codde) {
        this.codde = codde;
    }
}

