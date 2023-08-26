/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionej1;

/**
 *
 * @author ALISS
 */
public class Collectionej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    import java.util.ArrayList;

public class EjemploColeccionJava {
    public static void main(String[] args) {
        // Crear una lista de enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar elementos a la lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        // Acceder a elementos de la lista
        System.out.println("Primer elemento: " + numeros.get(0)); // Debe imprimir 10
        System.out.println("Tamaño de la lista: " + numeros.size()); // Debe imprimir 4

        // Iterar a través de la lista e imprimir los elementos
        System.out.println("Elementos de la lista:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Eliminar un elemento de la lista
        numeros.remove(2); // Elimina el elemento en la posición 2 (30)

        // Iterar a través de la lista actualizada
        System.out.println("Elementos de la lista después de eliminar:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

}
