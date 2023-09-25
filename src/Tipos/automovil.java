package Tipos;

public class automovil extends vehiculoDePasajeros {
    //Atributos
    private int numPuertas;

    //Constructor
    public automovil(String marca, String modelo, int year, int velocidad, int numPasajeros, int numPuertas)
    {
        super(marca, modelo, year, velocidad, numPasajeros);
        this.numPuertas=numPuertas;
    }

    //Métodos
    public int abrirPuertas(int numPuertas)
    {
        System.out.println("El auto está abriendo sus " +numPuertas + " puertas");

        return numPuertas;
    }

    //Getters y Setters
      public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
