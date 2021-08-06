package Entidades;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable{

    private String nombre;
    private String dni;
    private String ap_materno;
    private String ap_paterno;
    private String codigo;
    private String Institucion;
    private String carrera;
    
    public Usuario(String n,String aP,String aM,String dni,String cod,String fac,String car){
        this.nombre = n;
        this.dni = dni;
        this.ap_paterno = aP;
        this.ap_materno = aM;
        this.codigo = cod;
        this.Institucion = fac;
        this.carrera = car;
    }
    
    public void editarUsuario(Usuario u){
        this.setNombre(u.getNombre());
        this.setDni(u.getDni());
        this.setAp_paterno(u.getAp_paterno());
        this.setAp_materno(u.getAp_materno());
        this.setCodigo(u.getCodigo());
        this.setInstitucion(u.Institucion);
        this.setCarrera(u.getCarrera());
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
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String toString(){
        return this.nombre+","+this.ap_paterno+","+this.ap_materno+","+this.dni+","+
                this.codigo+","+this.Institucion+","+this.carrera;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.dni);
        hash = 97 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;

        return (Objects.equals(this.codigo, other.getCodigo()) | Objects.equals(this.dni, other.getDni()) );
    }

    
    
    
}
