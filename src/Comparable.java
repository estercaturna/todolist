import java.util.Comparator;

public class Comparable implements Comparator<toDoItems> {


    @Override
    public int compare(toDoItems l1, toDoItems l2) {
        //se a prioridade  for menor q a segunda retorna -1
        if (l1.imp.getPrio() < l2.imp.getPrio()) {
            return -1;
        } else if (l1.imp.getPrio() > l2.imp.getPrio()) {
            //se a primeira prioridade for maior retorna 1
            return 1;
        } else if (l1.num > l2.num) {
            return 1;
        } else if (l1.num < l2.num) {
            return -1;
        }


        return 0;
    }
}
