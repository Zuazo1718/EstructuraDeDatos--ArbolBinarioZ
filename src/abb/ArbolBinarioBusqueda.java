package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        raiz = null;
    }
    // Arbol esta vacio o no
    public boolean estaVacia(){
        return  raiz == null;
    }

    //metodo recursivo para insertar un nodo
    public void insertar(Nodo padre, Nodo hijo, int dato){
        if (hijo == null){//caso base
            Nodo nuevo = new Nodo(null, dato,null);
            if (dato >= padre.getDato()){
                padre.setDerecho(nuevo);
            }else {
                padre.setIzquierdo(nuevo);
            }
        }else{//llama recursiva
            if (dato >= padre.getDato()){
                insertar(hijo, hijo.getDerecho(), dato);
            }else {
                insertar(hijo,hijo.getIzquierdo(), dato);
            }
        }
    }

    //metodo para auxiliar para insertar  a  un nuevo nodo al arbol
    public void insertar(int dato){
        if (estaVacia()){
            Nodo nuevo = new Nodo(null, dato,null);
            raiz = nuevo;
        }else {
            if (dato>= raiz.getDato()){
                insertar(raiz, raiz.getDerecho(), dato);
            }else {
                insertar(raiz, raiz.getIzquierdo(), dato);
            }
        }
    }
    //metodo recursivo para recorrer el arbol y mostrar en orden
    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){//caso base

        }else {//llamada recursiva
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "   ");
            mostrarInOrden(nodo.getDerecho());
        }
    }

    //Metodo auxiliar para recorrer/mostrar  el arbol
    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}













































