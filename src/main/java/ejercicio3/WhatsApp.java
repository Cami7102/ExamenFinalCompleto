package ejercicio3;

public class WhatsApp implements IRedSocial {
    private ISistema sistema;

    public WhatsApp(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void showInfo() {
        System.out.println("***DATOS DEL SISTEMA EN WHATSAPP***");
        sistema.showInfo();
    }
}
