package com.company;

public class Lista {
    private Nodo primero; //Nodo cabecera

    public Lista() {
        this.primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Lista insertarCabeza(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.setEnlace(primero);
        primero = nuevo;
        return this;
    }

    public void visualizarLista() {
        Nodo n;
        int k = 0;
        n = primero;

        while (n != null) {
            System.out.print(n.getDato() + " ");
            n = n.getEnlace();
            k++;
            System.out.print((k % 20 != 0 ? "" : "\n"));
        }
        System.out.println();
    }

    public void visualizarListaPares() {
        Nodo n;
        int k = 0;
        n = primero;
        int j = 0;
        while (n != null) {
            if (n.getDato() % 2 == 0){
                System.out.print(n.getDato() + " ");
                System.out.print((k % 5 != 0 ? "" : ""));
                k++;
                j++;
            }
                n = n.getEnlace();
                //Para que cuando exista un salto cada 5 elementos
                if(j==5){
                    System.out.println();
                    j=0;
                }

        }
    }
}

