import Materia.Moders.Cola;
import Materia.Moders.Colagenerica;
import Materia.Moders.Pantalla;
import Materia.Moders.PilaGenerica;
import Materia.Moders.Pilas.Pila;

public class App {
    public static void main(String[] args) throws Exception {
        //Pila
        System.out.println("Pila");
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        System.out.println("Elemento en  la cima de la pila " + pila.peek());
        System.out.println("Elemento eliminado de la es " + pila.pop());
        System.out.println("Elemento en  la cima de la pila " + pila.peek());

        System.out.println();

        //Cola
        System.out.println("Cola");
        Cola cola= new Cola();
        cola.addNode(10);
        cola.addNode(20);
        cola.addNode(30);

        //Mostrar elemto al frente
        System.out.println("Elemento al frente "+cola.peek());
        //Retirar elementos cola
        System.out.println("Elemento retirado "+ cola.remove());
        System.out.println("Elemento al frente "+cola.peek());
        System.out.println("Elemento retirado "+ cola.remove());
        System.out.println("Elemento al frente "+cola.peek());

        //Ver si la cola esta vacia
        System.out.println("Cola vacia? "+(cola.isEmpty()?"Si":"No"));


        //Pila generica
        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Home page", "/home",1));
        pilaPantallas.push(new Pantalla("Desktop", "/Desktop",2));
        pilaPantallas.push(new Pantalla("Set page", "/home/menu/settings",3));
        System.out.println("Estoy en la pantalla "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla "+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla "+pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User page", "/home/menu/user",4));
        System.out.println("Estoy en la pantalla \n\t "+pilaPantallas.peek().getNombre());

        //Cola generica 
        Colagenerica<Pantalla> colagenerica=new Colagenerica<>();
        colagenerica.addNode(new Pantalla("Home", "/Home",1));
        colagenerica.addNode(new Pantalla("Desktop", "/Desktop",2));
        colagenerica.addNode(new Pantalla("Setpage", "/home/menu/settings\"",3));

        System.out.println("Estoy en la pantalla \t "+colagenerica.peek().getNombre());
        System.out.println("Pantalla destruida \t "+colagenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla \t "+colagenerica.peek().getNombre());
        System.out.println("Pantalla destruida \t "+colagenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla \t "+colagenerica.peek().getNombre());
        System.out.println("Pantalla destruida \t "+colagenerica.remove().getNombre());
    }
}
