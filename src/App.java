import models.Produc;

public class App {
    public static void main(String[] args) throws Exception {
        Produc[] products = {
            new Produc("Laptop", 20),
            new Produc("Tablet", 10),
            new Produc("Smartphone", 25),
            new Produc("Monitor", 5),
            new Produc("Keyboard", 15)
        };
        BusquedaBinaria busqueda = new BusquedaBinaria();
        busqueda.sortByName(products);
        for (Produc product : products) {
            System.out.println(product);
        }

        int res = busqueda.findByName(products, "Monitor");
        if (res >= 0) {
            System.out.println("Se encontro en la posicion: " + res);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
