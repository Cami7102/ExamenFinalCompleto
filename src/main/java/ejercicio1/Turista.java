package ejercicio1;

import java.util.Random;

public class Turista implements IVisitante{
    private String nombre;
    private String ci;
    private int monto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public void gastarLaPaz(LaPaz lapaz) {
        int rv = new Random().nextInt(1000);
        if(lapaz.getClima().equals("Soleado") && monto > rv){
            int montos = monto - rv;
            System.out.println("Gasta: " + rv);
            System.out.println("Saldo: " + montos);
            int recibir = lapaz.getDinero() + rv;
            lapaz.setDinero(recibir);
            lapaz.showInfo();
        }else {
            System.out.println("No gastare nada");
        }
    }

    @Override
    public void gastarCocha(Cochabamba cochabamba) {
        int rv = cochabamba.getDinero() * 10 /100;
        if(cochabamba.getClima().equals("Veraniego") && monto > rv){
            int montos = monto - rv;
            System.out.println("Gasta: " + rv);
            System.out.println("Saldo: " + montos);
            int recibir = cochabamba.getDinero() + rv;
            cochabamba.setDinero(recibir);
            cochabamba.showInfo();
        }else {
            System.out.println("No gastare nada");
        }
    }

    @Override
    public void gastarSanta(SantaCruz santaCruz) {
        int rv = santaCruz.getDinero() * 50 /100;
        if(santaCruz.getClima().equals("Nublado") && monto > rv){
            int montos = monto - rv;
            System.out.println("Gasta: " + rv);
            System.out.println("Saldo: " + montos);
            int recibir = santaCruz.getDinero() + rv;
            santaCruz.setDinero(recibir);
            santaCruz.showInfo();
        }else {
            System.out.println("No gastare nada");
        }
    }
}
