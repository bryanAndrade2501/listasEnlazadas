package com.company;

public class Nodo {
    private int dato;
    private Nodo enlace;

    public Nodo(int elemento){
        this.dato = elemento;
        this.enlace = null;
    }

    public Nodo(int elemento, Nodo enlace){
        this.dato = elemento;
        this.enlace = enlace;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int elemento) {
        this.dato = elemento;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
