/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myarraylist;

/**
 *
 * @author Jr_Ne
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<String> listDias = new ArrayList<>();
        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miercoles");
        listDias.add("Jueves");
        listDias.add("Viernes");
        listDias.add("Sabado");
        listDias.add("Domingo");
        listDias.add("Juernes");

        System.out.println(listDias.get(3) + "," + listDias.get(4));
        System.out.println(listDias.get(0) + "," + listDias.get(listDias.size() - 1));
        System.out.println(listDias);

        if (listDias.remove("Juerves")) {
            System.out.println("Borrado");
        } else {
            System.out.println("No existe");
        }

        Iterator<String> it = listDias.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        if (listDias.contains("Lunes")) {
            System.out.println("Si existe Lunes");
        }

        Iterator<String> it2 = listDias.iterator();
        while (it2.hasNext()) {
            if ("Lunes".equals(it2.next().toString().toUpperCase())) {
                // Do something
            }
        }

        Collections.sort(listDias);

        System.out.println(listDias);

        listDias.clear();
        System.out.println(listDias);
    }
}
