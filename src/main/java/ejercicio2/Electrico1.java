package ejercicio2;

import java.util.Random;

public class Electrico1 implements IElectricas{

    private int bateria;

    public Electrico1() {
        bateria = 0;
    }

    @Override
    public void cargar() {
        bateria = new Random().nextInt(20)+1;
        System.out.println("Cargando: " +bateria);
    }

    @Override
    public int estadoDeElectricidad() {
        int est = new Random().nextInt(10)+1;
        System.out.println("Estado de electricidad: " + est);
        return est;
    }
}
