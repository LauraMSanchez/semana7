package Tipos;

public class vehiculoDePasajeros extends vehiculo {
    //Atributos
    private int numPasajeros;

    //Constructor
    public vehiculoDePasajeros(String marca, String modelo, int year, int velocidad, int numPasajeros)
    {
        super(marca, modelo, year, velocidad);
        this.numPasajeros=numPasajeros;
    }

    //Métodos
    public int transportarPasajeros(int numPasajeros)
    {
        System.out.println("El vehículo transporta a " + numPasajeros + " pasajeros");

        return numPasajeros;
    }

    //Getters y Setters 
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
}
