package ejercicio3;

public class Facebook implements IRedSocial {
    private ISistema sistema;

    public Facebook(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void showInfo() {
        System.out.println("***DATOS DEL SISTEMA EN FACEBOOK***");
        sistema.showInfo();
    }
}
