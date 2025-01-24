package models;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object obj) { // equaal recibe un objeto que va comparar
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Contacto contacto = (Contacto) obj;
        return nombre.equals(contacto.nombre) && apellido.equals(contacto.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " - " + telefono;
    }
}

