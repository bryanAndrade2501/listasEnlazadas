package com.company;

public class listaCircularDoble {
    private Nodo primero;
    private Nodo ultimo;

    public listaCircularDoble(){
        primero = null;
        ultimo = null;
    }

    public void ingresarNodo(int elemento){
        Nodo nuevo = new Nodo();
        nuevo.dato = elemento;
        if(primero == null){
            primero = nuevo;
            primero.nodoProximo = primero;
            nuevo.nodoAnterior = ultimo;
            ultimo = nuevo;
        }else{
            ultimo.nodoProximo = nuevo;
            nuevo.nodoProximo = primero;
            nuevo.nodoAnterior = ultimo;
            ultimo = nuevo;
            primero.nodoAnterior = ultimo;
        }
    }
    public void recorrer1(){
        Nodo actual = new Nodo();
        actual = primero;
        int i=0;
        do {
            System.out.println("Dato " + i + ": " + actual.dato);
            actual = actual.nodoProximo;
            i++;
        }while(actual != primero);
        System.out.println();
    }
    public void recorrer(){
        Nodo actual = new Nodo();
        actual = primero;
        do {
            System.out.print(actual.dato + " ");
            actual = actual.nodoProximo;
        }while(actual != primero);
        System.out.println();
    }


    public void eliminarNodo(int elemento) {
        Nodo actual;
        boolean encontrado = false;
        actual = primero;

        while (actual.getNodoProximo() != primero && !encontrado) {
            encontrado = (actual.getNodoProximo().getDato() == elemento);
            if (!encontrado) {
                actual = actual.getNodoProximo();
            }
        }
        encontrado = (actual.getNodoProximo().getDato() == elemento);

        if (encontrado) {
            Nodo n;
            n = actual.getNodoProximo();
            if (primero == primero.getNodoProximo()) {
                primero = null;
            } else {
                if (n == primero) {
                    primero= actual;
                }
                actual.setNodoProximo(n.getNodoProximo());
            }
            n = null;
        }
    }


}
