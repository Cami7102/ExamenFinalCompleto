package ejercicio5;

public class VidrioTemplado extends Decoradores{

    public VidrioTemplado(ICelular celular, int precio1) {
        super(celular, precio1);
    }

    @Override
    public void showInfo() {
        System.out.println("***CARCASA***");
        super.showInfo();
        int precioNuevo = precio1 + 40;
        System.out.println("Precio del celular con el vidrio templado incremente a: "+ precioNuevo);
    }

    @Override
    public void setCosto(int monto) {

    }

    @Override
    public int getCosto() {
        return 0;
    }
}
