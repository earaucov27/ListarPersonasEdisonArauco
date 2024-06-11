package org.earauco.listarPersonas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListarPersonasArauco {
    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();

        // Añadir 5 objetos Persona con nombres y apellidos en español aleatorios
        personas.add(new Persona("Edison", "Arauco"));
        personas.add(new Persona("Felipe", "Gutierrez"));
        personas.add(new Persona("Juan", "Pozo"));
        personas.add(new Persona("Fabian", "Quinteros"));
        personas.add(new Persona("Belén", "Villagran"));

        // Iterar y mostrar los nombres y apellidos
        System.out.println("Lista de personas:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Ordenar alfabéticamente por nombre
        Collections.sort(personas, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        System.out.println("\nOrdenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Ordenar alfabéticamente por apellido
        Collections.sort(personas, (p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ' ' + persona.getNombre());
        }

        // Ordenar inversamente por apellido
        Collections.sort(personas, (p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ' ' + persona.getNombre());
        }
    }
}