package pilas;
/*
Sirve como puntero al siguiente dato
*/

public class Node <T>{
	protected T data; // aqui se guarda el dato
    protected Node<T> nextElement; 

    public Node(T v, Node<T> next) {
        data = v;
        nextElement = next;
    }

    /**
     * @param se crea una nueva cola
     */
    public Node(T v) {
        this(v,null);
    }

    public Node<T> next() {
        return nextElement;
    }

    /**
     *  
     * @param siguiente
     */
    public void setNext(Node<T> next) {
        nextElement = next;
    }

    /**
     *  
     * @return valor de la referencia
     */
    public T value() {
        return data;
    }

    public void setValue(T value) {
        data = value;
    }
}



