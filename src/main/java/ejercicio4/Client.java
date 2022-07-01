package ejercicio4;

public class Client {
    public static void main(String[] args) {

        Proxy proxy = new Proxy();

        Usuarios uno = new Usuarios("Joge", 77, "pd78");
        Usuarios dos = new Usuarios("Jorge", 52, "pd77");

        proxy.add(uno);
        proxy.add(dos);

        proxy.login(uno, "Joge", "pd78");
        proxy.login(dos, "Jorge", "pd77");
        proxy.login(dos, "Joge", "pd77");

        proxy.atender();
    }
}
