package ejercicio5;

public class Samsung implements ICelular {
    private int ram;
    private int almacenamiento;
    private int cpu;
    private int precio;

    public Samsung(int ram, int almacenamiento, int cpu, int precio) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @Override
    public int getCosto() {
        return precio;
    }

    @Override
    public void setCosto(int monto) {
        this.precio = monto;
    }

    @Override
    public void showInfo() {
        System.out.println("*** Celular Samsung ***");
        System.out.println("Precio: " + precio);
    }
}
