package ejercicio5;

public class Carcasa extends Decoradores{

    public Carcasa(ICelular celular, int precio1) {
        super(celular, precio1);
    }

    @Override
    public void showInfo() {
        System.out.println("***CARCASA***");
        super.showInfo();
        int precioNuevo = precio1 + 10;
        System.out.println("Precio del celular con la carcasa incremente a: "+ precioNuevo);
    }

    @Override
    public void setCosto(int monto) {

    }

    @Override
    public int getCosto() {
        return 0;
    }
}
