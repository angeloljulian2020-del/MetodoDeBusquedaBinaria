package models;

public class Produc {

    //2 atributos
    //nombre
    //cantidad

    private String name;
    private int cantidad;

    public Produc(String name, int cantidad) {
        this.name = name;
        this.cantidad = cantidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Produc [name=" + name + ", cantidad=" + cantidad + "]";
    }
    

    
    
}
