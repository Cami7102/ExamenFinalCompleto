package ejercicio5;

public class Decoradores implements ICelular{
    protected ICelular celular;
    protected int precio1;

    public Decoradores(ICelular celular, int precio1) {
        this.celular = celular;
        this.precio1 = precio1;
    }


    @Override
    public void showInfo() {
        celular.showInfo();
    }

    @Override
    public void setCosto(int monto) {

    }

    @Override
    public int getCosto() {
        return 0;
    }
}
