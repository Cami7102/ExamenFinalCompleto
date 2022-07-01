package ejercicio2;

public class Electrico2 implements INormales{

    private Electrico1 electrico1;

    public Electrico2(Electrico1 electrico1) {
        this.electrico1 = electrico1;
    }

    @Override
    public void llenarGasolina() {
        electrico1.cargar();
    }

    @Override
    public int estado() {
        return electrico1.estadoDeElectricidad();
    }
}
