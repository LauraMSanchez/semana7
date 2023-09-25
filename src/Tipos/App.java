package Tipos;
public class App {
    public static void main(String[] args){

        vehiculo Vehiculo1 = new vehiculo("RENAULT ", "LOGAN ", 2009, 150);
        System.out.println(Vehiculo1.getMarca() + " " +Vehiculo1.getModelo() + " " +Vehiculo1.getYear() + " " +Vehiculo1.getVelocidad());
        System.out.println(Vehiculo1.acelerar(130));
        System.out.println("\n");

        vehiculoDePasajeros VehiculoDePasajeros1 = new vehiculoDePasajeros("MAZDA", "CX5", 2023, 200, 5);
        System.out.println(VehiculoDePasajeros1.getMarca()+ " " +VehiculoDePasajeros1.getModelo()+ " " +VehiculoDePasajeros1.getYear()+ " " +VehiculoDePasajeros1.getVelocidad()+ " " +VehiculoDePasajeros1.getNumPasajeros());
        System.out.println(VehiculoDePasajeros1.transportarPasajeros(5));
        System.out.println("\n");

        automovil Automovil1 = new automovil("MERCEDES BENZ", "AMG GT", 2015, 170, 5, 5);
        System.out.println(Automovil1.getMarca()+ " " +Automovil1.getModelo()+ " " +Automovil1.getYear()+ " " +Automovil1.getVelocidad()+ " " +Automovil1.getNumPasajeros()+ " " +Automovil1.getNumPuertas());
        System.out.println(Automovil1.abrirPuertas(5));
        System.out.println("\n");
    
        vehiculoCarga VehiculoCarga1 = new vehiculoCarga("JAC", "JHR POWER", 2021, 160, 2.8, 2.0);
        System.out.println(VehiculoCarga1.getMarca()+ " " +VehiculoCarga1.getModelo()+ " " +VehiculoCarga1.getYear()+ " " +VehiculoCarga1.getVelocidad()+ " " +VehiculoCarga1.getCapacidadCarga()+ " " +VehiculoCarga1.getCarga());
        System.out.println(VehiculoCarga1.cargarCarga(2.8, 2.0));
        System.out.println("\n");
    }
}
