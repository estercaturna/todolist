public class Main {
    public static void main(String[] args) {

            toDoList toDolist = new toDoList();
        toDolist.add(Importance.HIGH, 1, "limpar o po.");
        toDolist.add(Importance.MEDIUM, 1, "lavar o chao.");
        toDolist.add(Importance.LOW, 1, "fazer a cama.");
        toDolist.add(Importance.HIGH, 2, "comprar comida.");
        toDolist.add(Importance.MEDIUM,2, "Lavar a loiça.");
        toDolist.add(Importance.LOW, 2, "arrumar as compras");


        while(!toDolist.isEmpty()){
            System.out.println(toDolist.remove());
        }

    }
}
