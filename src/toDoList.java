import org.omg.PortableServer.ImplicitActivationPolicy;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Comparator;

public class toDoList  {
    
    private PriorityQueue<toDoItems> list = new PriorityQueue<>(new Comparable());
    private toDoItems items;


    public toDoList() {

    }


    public void add(Importance imp, int prio, String items){

        list.offer(new toDoItems(imp, prio, items));

    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    public boolean remove(){
        if (list.size() != 0) {
            list.poll();
            return true;
        }
        return false;
    }



}
