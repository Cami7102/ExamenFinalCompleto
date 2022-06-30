package ejercicio1;

public class Client {
    public static void main(String[] args){
        Turista turista = new Turista();
        turista.setNombre("Edgar");
        turista.setCi("1234567");
        turista.setMonto(3000);

        //LaPaz laPaz = new LaPaz("Bienvenidos a la Ciudad de La Paz", "8", "10000000", "Soleado");
        //Cochabamba cochabamba = new Cochabamba("Bienvenidos a la Ciudad de Cochabamba", "9", "10000", "Veraniego");
        SantaCruz santaCruz = new SantaCruz("Bienvenidos a la Ciudad de Santa Cruz", "10", "100000000", "Nublado");

        //laPaz.viaje(turista);
        //cochabamba.viaje(turista);
        santaCruz.viaje(turista);

        //Cambiando el atributo dinero en la ciudad de cochabamba y santa cruz
    }
}
