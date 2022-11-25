import java.util.PriorityQueue;
import java.util.Comparator;
public class toDoItems {

    Importance imp;
    int num;
    String items;

    public toDoItems(Importance imp, int num, String items) {
        this.imp = imp;
        this.num = num;
        this.items = items;

    }

    @Override
    public String toString() {
        return "toDoItems{" +
                "imp=" + imp +
                ", num=" + num +
                ", items='" + items + '\'' +
                '}';
    }

}

