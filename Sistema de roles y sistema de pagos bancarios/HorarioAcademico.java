public class HorarioAcademico implements  imprimir{
    private String horario  = "7-12";
    @Override
    public void imprimir(){
        System.out.println("El horario del curso fue: " + horario);
    }
}
