package pilas;
/*
Clase Vector con genéricos
*/

import java.util.EmptyStackException;
import java.util.Vector;


public class Vector <T> implements IStack<T> {
    protected Vector<T> data = new Vector<T>(1);

    
    /** 
     * Add new element to top
     * @param item
     */
    @Override
    public void push(T item) {
        data.addElement(item);
    }

    
    /** 
     * Remove last element pushed and return value
     * @return T
     * @throws EmptyStackException
     */
    @Override
    public T pop() throws EmptyStackException {
        return data.remove(data.size() - 1);
    }

    
    /** 
     * Return last element pushed
     * @return T
     * @throws EmptyStackException
     */
    @Override
    public T peek() throws EmptyStackException {
        return data.lastElement();
    }

    
    /** 
     * verdadero si no el stack esta vacio
     * @return boolean
     */
    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    
    /** 
     * size of stack
     * @return int
     */
    @Override
    public int size() {
        return data.size();
    }

}

