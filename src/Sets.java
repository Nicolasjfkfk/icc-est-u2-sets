
import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    // Método para construir un HashSet
    public Set<String> construirHashSet() {
        Set<String> miHashSet = new HashSet<>();
        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocotón");
        miHashSet.add("Melón");
        miHashSet.add("Pera"); // Duplicado, no se agrega
        return miHashSet;
    }

    // Método para construir un LinkedHashSet
    public Set<String> construirLinkedHashSet() {
        Set<String> miLinkedHashSet = new LinkedHashSet<>();
        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocotón");
        miLinkedHashSet.add("Melón");
        miLinkedHashSet.add("Pera"); 
        return miLinkedHashSet;
    }

    // Método para construir un TreeSet
    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocotón");
        miTreeSet.add("Melón");
        miTreeSet.add("Pera"); 
        return miTreeSet;
    }

    // Método para construir un TreeSet con un comparador personalizado
    public Set<String> construirTreeSetConComparador() {
        // Crear un comparador que ordena por longitud y luego alfabéticamente
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Primero comparamos la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                // Si tienen la misma longitud, comparamos alfabéticamente
                if (resultado == 0) {
                    return s1.compareTo(s2);
                }
                return resultado;
            }
        };

        
        Set<String> miTreeSetConComparador = new TreeSet<>(comparadorPorLongitud);
        miTreeSetConComparador.add("Melon");
        miTreeSetConComparador.add("Pera");
        miTreeSetConComparador.add("Manzana");
        miTreeSetConComparador.add("Fresa");
        miTreeSetConComparador.add("Kiwi");
        miTreeSetConComparador.add("Melocoton");
        miTreeSetConComparador.add("Pera"); // Elemento repetido, no se añadira de nuevo

        return miTreeSetConComparador;
    }
}
