package ejercicio2;

public class Client {
    public static void main(String []args) throws InterruptedException {
        INormales gas = new Gasolina();
        gas.estado();
        gas.llenarGasolina();

        INormales die = new Diesel();
        die.estado();
        die.llenarGasolina();

        INormales gasE = new GasolinaEspecial();
        gasE.estado();
        gasE.llenarGasolina();

        INormales uno = new Electrico2(new Electrico1());
        uno.llenarGasolina();
        uno.estado();
    }
}
