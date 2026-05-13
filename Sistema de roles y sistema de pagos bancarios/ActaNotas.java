public class ActaNotas implements imprimir{
    private double notas = 8.4;
    @Override
    public void imprimir(){
        System.out.println("Su nota final del curso es: "  + notas);
    }
}
