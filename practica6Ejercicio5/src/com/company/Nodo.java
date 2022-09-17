package com.company;

public class Nodo {
    protected int dato;
    protected Nodo nodoProximo;
    protected Nodo nodoAnterior;

    public Nodo (int elemento){
        this.dato = elemento;
        this.nodoProximo= this.nodoAnterior=null;
    }
    public Nodo (){
        this.nodoProximo= this.nodoAnterior=null;
    }
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNodoProximo() {
        return nodoProximo;
    }

    public void setNodoProximo(Nodo nodoProximo) {
        this.nodoProximo = nodoProximo;
    }

    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

}
