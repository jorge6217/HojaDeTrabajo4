package pilas;

public class DoubleLinkedList  <T> extends ClaseAbstracta implements IList<T>{
	protected DoublyLinkedNode<T> head;
    protected DoublyLinkedNode<T> tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        cont = 0;
    }

}
