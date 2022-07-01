package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidores{
    private List<Usuarios> usu = new ArrayList<>();

    public Servidor2() {
        usu = new ArrayList<>();
    }

    @Override
    public void login(Usuarios usuarios, String nombre, String psw) {
        usu.add(usuarios);
    }

    @Override
    public void atender() {
        for(Usuarios usuarios:usu){
            System.out.println("Servidor #2 atiende al usuario con id: "+ usuarios.getId());
            usuarios.showInfo();
        }
    }
}
