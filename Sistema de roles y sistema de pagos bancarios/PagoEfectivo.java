public class PagoEfectivo implements Pagable{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Sistema de pagos en efectivo");
        if (monto > 0) {
            System.out.println("Su metodo de pago no posee comisiones");
            System.out.println("Total a a pagar : " + monto);
        }else {
            System.out.println("El monto imgresado es invalido.");
        }
        System.out.println("==================");
    }
}
