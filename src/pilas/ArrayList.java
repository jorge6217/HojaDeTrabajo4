package pilas;
/*
Almacena la informacion que esta en el datos.txt
*/
import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayList <T> implements IList<T> {
    private ArrayList<T> data = new ArrayList<T>();

    
    /** 
     * @param item
     */
    @Override
    public void push(T item) {
        data.add(item);
    }

    
    /** 
     * @return E
     * @throws EmptyStackException
     */
    @Override
    public T pop() throws EmptyStackException {
        return data.remove(data.size() - 1);
    }

    
    /** 
     * @return E
     * @throws EmptyStackException
     */
    @Override
    public T peek() throws EmptyStackException {
        return data.get(data.size() - 1);
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    
    /** 
     * @return int
     */
    @Override
    public int size() {
        return data.size();
    }

}

