import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();

        runEjercicio();
    }

    public static void runHashSet() {
        Sets sets = new Sets(); 
        Set<String> ejemploHashSet = sets.construirHashSet(); 

        System.out.println("------HashSet------");
        System.out.println("Elementos del HashSet (no se garantiza orden):");

        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet() {
        Sets sets = new Sets(); 
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();

        System.out.println("------LinkedHashSet------");
        System.out.println("Elementos del LinkedHashSet (mantiene el orden de inserción):");

        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet() {
        Sets sets = new Sets(); 
        Set<String> ejemploTreeSet = sets.construirTreeSet();

        System.out.println("------TreeSet------");
        System.out.println("Elementos del TreeSet (ordenados naturalmente):");

        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparador() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetComparador = sets.construirTreeSetConComparador();
        System.out.println("\n----- TreeSet con Comparador -----");
        System.out.println("Elementos del TreeSet (ordenados por longitud y alfabéticamente):");
        for (String elemento : ejemploTreeSetComparador) {
            System.out.println(elemento + " (longitud: " + elemento.length() + ")");
        }
    }

    public static void runEjercicio() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        agenda.add(new Contacto("Renato", "Yadaicela", "0994578194"));
        agenda.add(new Contacto("Pablo", "Siranaiula", "0985471567"));
        agenda.add(new Contacto("Jhon", "Tigre", "0936475122"));
        agenda.add(new Contacto("Noemi", "Fernandez", "0987546121")); 
        agenda.add(new Contacto("Ana", "Fernandez", "0942157412")); 

        System.out.println("\n----- Ejercicio: Agenda de contactos -----");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
