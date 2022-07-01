package ejercicio3;

public class Client {
    public static void main(String[] args){

        Colegio colegio = new Colegio("UEE", 100, "Carnet de identidad");
        colegio.add(new Estudiante("Edgar Guzman", 17));

        Escuela escuela = new Escuela("Maure", 30, "Certificado de nacimiento");
        escuela.add(new Estudiante("Vivian Arteaga", 12));

        Universidad universidad = new Universidad("UPB", 150, "Titulo de bachiller");
        universidad.add(new Estudiante("Micael Escalera", 20));

        Facebook facebook = new Facebook(colegio);
        facebook.showInfo();

        WhatsApp whatsApp = new WhatsApp(escuela);
        whatsApp.showInfo();

        Twitter twitter = new Twitter(universidad);
        twitter.showInfo();
    }
}
