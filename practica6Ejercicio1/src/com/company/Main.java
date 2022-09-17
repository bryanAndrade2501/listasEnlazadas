package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int longitud = 20;
        Lista lista;
        lista = new Lista();
        int i = 0;
        while (i < longitud) {
            int n = (int) (Math.random() * (101 - 1) + 1);
            lista.insertarCabeza(n);
            i++;
        }
        System.out.println("Los elemento de la lista son: ");
        lista.visualizarLista();
        System.out.println("Los elementos pares de la lista son: ");
        lista.visualizarListaPares();
    }

}

