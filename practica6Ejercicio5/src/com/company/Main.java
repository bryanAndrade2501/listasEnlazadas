package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int eliminarElemento;
        listaCircularDoble lista = new listaCircularDoble();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insertando 7 nodos a la lista");
        listaAleatoria(7,lista);
        lista.recorrer1();
        System.out.println("Imprimiendo lista circular doble");
        lista.recorrer();
        System.out.println("Ingrese el elemento a eliminar");
        eliminarElemento = scanner.nextInt();
        lista.eliminarNodo(eliminarElemento);
        System.out.println("Nueva lista circular");
        lista.recorrer();
    }
    public static void listaAleatoria(int longitud, listaCircularDoble lista) {
        int i = 0;
        while (i < longitud) {
            lista.ingresarNodo((int) (Math.random() * (100 - 10) + 10)); //Aleatoria entre 10 y 100
            i++;
        }
    }
}
