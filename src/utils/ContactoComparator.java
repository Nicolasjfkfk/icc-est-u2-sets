package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero comparamos los apellidos
        int comparacionApellido = c1.getApellido().compareTo(c2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido; // Retorna la comparación de apellidos si no son iguales
        }
        // Si los apellidos son iguales, comparamos los nombres
        return c1.getNombre().compareTo(c2.getNombre());
    }
}

