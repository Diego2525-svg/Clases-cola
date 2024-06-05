package Materia.Moders;

public class NodeGenerico<T> {

    public T data;
    public NodeGenerico<T> next;

    public NodeGenerico(T data){
            this.data = data;
        }
}
