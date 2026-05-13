public class PagoTarjeta implements Pagable{
    double comision = 0.03;
    @Override
    public void procesarPago(double monto){
        System.out.println("Sistema de pagos de tarjeta");
        if(monto > 0 ){
            System.out.println("Su metodo de pago tiene comisiones del: " + comision * 100 +"%");
            System.out.println("Procesando pago...");
            System.out.println("Pago final tarjeta: " + ((monto*comision) + monto));
        }else{
            System.out.println("El monto ingresado es incorrecto");
        }
        System.out.println("==================");
    }
}
