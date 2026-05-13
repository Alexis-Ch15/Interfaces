import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de roles empresariales");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingrese su clave");
        String clave = sc.nextLine();
        Cajero caj1 = new Cajero();
        caj1.iniciarSesion(usuario,clave);
        caj1.gestionarDatos();
    }
}