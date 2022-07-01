package ejercicio3;

public class Twitter implements IRedSocial {
    private ISistema sistema;

    public Twitter(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void showInfo() {
        System.out.println("***DATOS DEL SISTEMA EN TWITTER***");
        sistema.showInfo();
    }
}
