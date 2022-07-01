package ejercicio5;

public class MemoriaExterna extends Decoradores{

    public MemoriaExterna(ICelular celular, int precio1) {
        super(celular, precio1);
    }

    @Override
    public void showInfo() {
        System.out.println("***CARCASA***");
        super.showInfo();
        int precioNuevo = precio1 + 70;
        System.out.println("Precio del celular con la memoria externa incremente a: "+ precioNuevo);
    }

    @Override
    public void setCosto(int monto) {

    }

    @Override
    public int getCosto() {
        return 0;
    }
}
