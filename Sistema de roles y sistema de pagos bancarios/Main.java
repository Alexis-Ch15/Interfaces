public class Main{
    public static void main(String[] args){
        //Ejercicio1 Sistema Academico de documentos
        System.out.println("Ejercicio1 Sistema Academico de documentos");
        Certificado cer1 = new Certificado();
        ActaNotas act1 = new ActaNotas();
        HorarioAcademico hor1 = new HorarioAcademico();
        cer1.imprimir();
        act1.imprimir();
        hor1.imprimir();

        //Ejercicio 2 Sistema bancario de pagos
        System.out.println("Ejercicio 2 Sistema bancario de pagos");
        PagoEfectivo efec1 = new PagoEfectivo();
        PagoTarjeta tarj1 = new PagoTarjeta();
        Transferencia trans1 = new Transferencia();
        efec1.procesarPago(100);
        trans1.procesarPago(29);
        tarj1.procesarPago(34);

        //Ejercicio 3 Sistema de roles empresariales

    }
}