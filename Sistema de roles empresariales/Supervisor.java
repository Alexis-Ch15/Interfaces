public class Supervisor  implements Autenticable, Reportable{
    private String usuario = "alex34";
    private String clave = "1233";
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if (this.usuario == usuario && this.clave == clave) {
            System.out.println("Ingreso exitoso");
            return true;
        } else {
            System.out.println("Error de ingreso");
            return false;
        }
    }
    @Override
    public void generarReporte(){
        System.out.println("El banco funciona exitosamente");
    }
}
