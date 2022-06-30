package ejercicio1;

public class Cochabamba implements IBolivia{
    private String nombre;
    private String numProv;
    private String numHabi;
    private String clima;
    private int dinero;

    public Cochabamba (String nombre, String numProv, String numHabi, String clima) {
        this.nombre = nombre;
        this.numProv = numProv;
        this.numHabi = numHabi;
        this.clima = clima;
        dinero = 70;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumProv() {
        return numProv;
    }

    public void setNumProv(String numProv) {
        this.numProv = numProv;
    }

    public String getNumHabi() {
        return numHabi;
    }

    public void setNumHabi(String numHabi) {
        this.numHabi = numHabi;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public void viaje(IVisitante visitante) {
        visitante.gastarCocha(this);
    }

    public void showInfo(){
        System.out.println("**** CIUDAD DE COCHABAMBA ****");
        System.out.println("Nombre: "+nombre);
        System.out.println("Numero de Provincias: "+numProv);
        System.out.println("Numero de habitantes: "+ numHabi);
        System.out.println("Clima: "+ clima);
    }
}
