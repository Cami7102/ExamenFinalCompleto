package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Escuela implements ISistema {
    private String nombre;
    private int capacidad;
    private String requisitos;
    private List<Estudiante> estudiantes;

    public Escuela(String nombre, int capacidad, String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisitos = requisitos;
        estudiantes = new ArrayList<>();
    }

    public void add(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    @Override
    public void showInfo() {
        System.out.println("***DATOS DE LA ESCUELA***");
        System.out.println("Nombre: "+nombre);
        System.out.println("Capacidad: "+ capacidad);
        System.out.println("Requisitos: "+requisitos);
        System.out.println("Estudiantes: ");
        for (Estudiante e:estudiantes) {
            System.out.println(" ~" + e.getNombre());
        }
    }
}
