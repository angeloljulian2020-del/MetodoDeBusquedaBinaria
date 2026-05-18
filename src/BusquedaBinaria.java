import models.Produc;
public class BusquedaBinaria {
    public int findByName(Produc[] products, String name) {
        int bajo = 0;
        int alto = products.length - 1;
        while (bajo <= alto) {
            //definimos el punto medio
            int central = bajo + (alto - bajo) / 2;
            //si es igual al nombre que buscamos, lo encontramos osea el punto medio es el producto que buscamos
            if (products[central].getName().equals(name)) {
                return central;

            //si el nombre del producto en el punto medio es menor que el nombre que buscamos, entonces el producto que buscamos se encuentra en la mitad superior del arreglo
            } else if (products[central].getName().compareTo(name) < 0) {
                bajo = central + 1; // Buscar en la mitad superior

            //si el nombre del producto en el punto medio es mayor que el nombre que buscamos, entonces el producto que buscamos se encuentra en la mitad inferior del arreglo
            } else {
                alto = central - 1; // Buscar en la mitad inferior
            }
        }
        //si llegamos aquí, significa que el producto no se encontró en el arreglo
        return -1; // Producto no encontrado

    }
    public  void sortByName(Produc[] products) {
        for (int j = 0; j < products.length - 1; j++) {
            boolean swap = false;
            for (int i = 0; i < products.length - j - 1; i++) {
                if (products[i].getName().compareTo(products[i + 1].getName()) > 0) {
                    Produc temp = products[i];
                    products[i] = products[i + 1];
                    products[i + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    
    }
}
