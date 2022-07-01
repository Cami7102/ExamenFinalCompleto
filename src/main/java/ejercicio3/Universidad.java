package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad implements ISistema {
    private String nombre;
    private int capacidad;
    private String requisitos;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre, int capacidad, String requisitos) {
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
        System.out.println("***DATOS DE LA UNIVERSIDAD***");
        System.out.println("Nombre: "+nombre);
        System.out.println("Capacidad: "+ capacidad);
        System.out.println("Requisitos: "+requisitos);
        System.out.println("Estudiantes: ");
        for (Estudiante e:estudiantes) {
            System.out.println("  - " + e.getNombre());
        }
    }
}
