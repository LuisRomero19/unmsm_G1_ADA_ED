package Entidades;

import java.io.Serializable;

public class Persona implements Serializable {
    protected String nombre;
    protected String dni;
    protected String ap_materno;
    protected String ap_paterno;
    
    public Persona(String nombre,String dni,String apPat,String apMat){
        this.nombre = nombre;
        this.dni = dni;
        this.ap_paterno = apPat;
        this.ap_materno = apMat;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }
}
