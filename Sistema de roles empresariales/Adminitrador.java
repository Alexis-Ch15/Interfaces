public class Adminitrador implements Autenticable,Gestionable,Reportable{
    private String usuario = "alex34";
    private String clave = "1233";
    @Override
    public boolean iniciarSesion(String usuario, String clave){
        if(this.usuario == usuario && this.clave == clave){
            System.out.println("Ingreso exitoso");
            return true;
        }else{
            System.out.println("Error de ingreso");
            return false;
        }
    }
    @Override
    public void gestionarDatos(){
        System.out.println("Los datos de la empresa se estan gestionando correctamente");
    }
    @Override
    public void generarReporte(){
        System.out.println("EL avance del proyecto va con lo planeado");
    }

}
