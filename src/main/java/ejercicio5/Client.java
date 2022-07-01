package ejercicio5;

public class Client {
    public static void main (String []args){
        ICelular apple = new Apple(8, 128, 4, 2500);
        apple = new Carcasa(apple, 30);
        apple = new VidrioTemplado(apple, 15);
        apple = new MemoriaExterna(apple,100);
        apple.showInfo();

        ICelular samsung = new Samsung(8, 128, 4, 2500);
        samsung = new Carcasa(samsung, 10);
        samsung = new VidrioTemplado(samsung, 20);
        samsung = new MemoriaExterna(samsung,115);
        samsung.showInfo();

        ICelular xiaomi = new Xiaomi(8, 128, 4, 2500);
        xiaomi = new Carcasa(xiaomi, 20);
        xiaomi = new VidrioTemplado(xiaomi, 10);
        xiaomi = new MemoriaExterna(xiaomi,90);
        xiaomi.showInfo();
    }
}
