
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoVerdugoGarciaAntonioRamon2023 miVehiculoVerdugoGarciaAntonioRamon2023;
        int stockActual;
        
        miVehiculoVerdugoGarciaAntonioRamon2023 = new VehiculoVerdugoGarciaAntonioRamon2023("Seat",18000,100);
        operativaVehiculosVerdugoGarciaAntonioRamon2223(miVehiculoVerdugoGarciaAntonioRamon2023, 50); 
        stockActual = miVehiculoVerdugoGarciaAntonioRamon2023.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosVerdugoGarciaAntonioRamon2223(VehiculoVerdugoGarciaAntonioRamon2023 miVehiculoVerdugoGarciaAntonioRamon2023, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoVerdugoGarciaAntonioRamon2023.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoVerdugoGarciaAntonioRamon2023.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
