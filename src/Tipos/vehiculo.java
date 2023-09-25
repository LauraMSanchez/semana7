package Tipos;

public class vehiculo {
    //Atributos
    String marca;
    String modelo;
    int year;
    int velocidad;

    //Constructor
    public vehiculo(String marca, String modelo, int year, int velocidad)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.year=year;
        this.velocidad=velocidad;
    }

    //Métodos
    public int acelerar(int velocidad)
    {
        System.out.println("El vehículo acelera a una velocidad de " + velocidad+ " kilometros por hora");

        return velocidad;
    }

    //Getter y Setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    
}

