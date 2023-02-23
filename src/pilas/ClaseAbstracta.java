package pilas;

public abstract class ClaseAbstracta {
	protected int cont;
    
    public boolean isEmpty() {
        return (cont == 0);
        /**
         * Indica si hay algo en la lista o si no lo hay 
         * @return boolean
         */
    }

    public int size() {

        return cont;
        /**
         * @return Tamaño de la lista 
         */
    }
}



