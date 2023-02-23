package pilas;
/*
Interfaz que representa las caracteristicas necesarias de una para emplear en la lectura de datos
*/

public interface IList<T> {


    /**
     * post: returns true iff list has no elements
     * @return
     */
    public boolean isEmpty();


    /**
     * pre: list is not empty
     * post: returns last value in list
     * @return
     */
    public T getLast();

    /**
     * pre: list is not empty
     * post: returns first value in list
     * @return
     */
    public T getFirst();


    /**
     * post: value is added to tail of list
     * @param value
     */
    public void add(T value);


    /**
     * pre: list has at least one element
     * post: removes last value found in list
     * @return
     */
    public T remove();

    /**
     * post: returns the number of elements in the stack
     *
     * @return The number of elements in the stack.
     */
    public int size();




}

