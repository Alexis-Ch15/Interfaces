public class Cajero implements Autenticable,Gestionable{
    private String usuario = "alex34";
    private String clave = "1233";
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if (this.usuario.equals(usuario) && this.clave.equals(clave)){
            System.out.println("Ingreso exitoso");
            return true;
        } else {
            System.out.println("Error de ingreso");
            return false;
        }
    }
    @Override
    public void gestionarDatos() {
        System.out.println("Los datos del sistema se estan organizando");
    }
}
