package ejercicio2;

import java.util.Random;

public class GasolinaEspecial implements INormales{

    private int capacidad;

    public GasolinaEspecial() {
        capacidad = 0;
    }

    @Override
    public void llenarGasolina() {
        capacidad = new Random().nextInt(50)+1;
        System.out.println("Llenado de gasolina: " +capacidad);
    }

    @Override
    public int estado() {
        int est = new Random().nextInt(50+1);
        System.out.println("Estado de la gasolina: " + est);
        return est;
    }
}
