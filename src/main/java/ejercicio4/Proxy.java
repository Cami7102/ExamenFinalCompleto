package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServidores{

    private IServidores servidor1;
    private IServidores servidor2;
    private List<Usuarios> usu;


    public Proxy() {
        usu = new ArrayList<>();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    public void add(Usuarios usuarios){
        usu.add(usuarios);
    }

    @Override
    public void login(Usuarios usuarios, String nombre, String psw) {
        if(nombre.equals(usuarios.getNombre()) && psw.equals(usuarios.getPws())) {
            System.out.println("Usuario correcto");
            if (primo(usuarios.getId())) {
                servidor1.login(usuarios, nombre, psw);
            } else {
                servidor2.login(usuarios, nombre, psw);
            }
        }else{
            System.out.println("Usuario incorrecto");
        }
    }

    @Override
    public void atender() {
        servidor1.atender();
        servidor2.atender();
    }

    public boolean primo(int numero){
        if(numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for(int x = 2; x < numero / 2; x++){
            if(numero % x == 0)
                return false;
        }
        return true;
    }
}
