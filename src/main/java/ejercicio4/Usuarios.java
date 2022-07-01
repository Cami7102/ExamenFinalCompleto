package ejercicio4;

public class Usuarios {
    private String nombre;
    private int id;
    private String pws;

    public Usuarios(String nombre, int id, String pws) {
        this.nombre = nombre;
        this.id = id;
        this.pws = pws;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }

    public void showInfo(){
        System.out.println("*** INFORMACION DEL USUARIO ***");
        System.out.println("Nombre: "+nombre);
        System.out.println("Id: "+id);
        System.out.println("Pws: "+pws);
    }
}
