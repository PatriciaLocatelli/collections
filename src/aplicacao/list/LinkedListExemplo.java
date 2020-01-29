package aplicacao.list;

import java.util.LinkedList;

public class LinkedListExemplo {
    public static void main(String[] args) {
        LinkedList<Number> lista = new LinkedList<>();
        lista.add(10);
        lista.add(20.89);
        lista.add(30L);
        lista.add(23.5F);

        for (Number l : lista) {
            System.out.println(l);
        }
        System.out.println("Remove o primeiro");
        lista.removeFirst();
        for (Number l : lista) {
            System.out.println(l);
        }
        System.out.println("Remove o último");
        lista.removeLast();
        for (Number l : lista) {
            System.out.println(l);
        }
    }
}
