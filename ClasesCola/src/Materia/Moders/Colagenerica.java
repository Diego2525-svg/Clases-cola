package Materia.Moders;
import java.util.NoSuchElementException;

public class Colagenerica <T>{

    private NodeGenerico<T> first;
    private NodeGenerico<T> last;

    public Colagenerica(){
        this.first=null;
        this.last=null;
    }

    public void addNode(T data){
        NodeGenerico<T> nuevoNodo= new NodeGenerico<>(data);
        if(isEmpty()){
            first=nuevoNodo;
            last=nuevoNodo;
        }else{
            last.next=nuevoNodo;
            last=nuevoNodo;
        }
    }

    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value=first.data;
        first=first.next;

        if(first==null){
            last=null;
        }
        return value;
    }

    public T peek(){

        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        T size = first.data;
        if (size== null){
            last=null;
        }
        size--;
        return size;
    }
}
