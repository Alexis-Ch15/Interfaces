public class Transferencia implements Pagable{
    double comision= 0.07;
    @Override
    public void procesarPago(double monto){
        System.out.println("Sistema de pago por Trasnferencia");
        if (monto > 0){
            System.out.println("Su metodo de pago posee una comision del: " + comision * 100 +"%");
            System.out.println("Procesando info...");
            System.out.println("Total a pagar: " + (monto*comision+monto));
        }else{
            System.out.println("Cantidad ingresada erronea");
        }
        System.out.println("==================");
    }
}
