package Tipos;

public class vehiculoCarga extends vehiculo {
    
    //Atributos
    private double capacidadCarga;
    private double carga;

    //Constructor
    public vehiculoCarga(String marca, String modelo, int year, int velocidad, double capacidadCarga, double carga)
    {
        super(marca, modelo, year, velocidad);
        this.capacidadCarga=capacidadCarga;
        this.carga=carga;
    }

    //Metodos
    public double cargarCarga(double capacidadCarga, double carga)
    {
        System.out.println("El vehiculo tiene capacidad para "+ capacidadCarga + " toneladas, y está cargado con "+ carga + " toneladas");

        return carga;
    }

    //Getters y Setters

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }


    
}
