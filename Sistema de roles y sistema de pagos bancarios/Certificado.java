public class Certificado implements imprimir{
    private String curso = "IA";
    @Override
    public void imprimir(){
        System.out.println("Usted finalizao un curso de " + curso);
    }
}
