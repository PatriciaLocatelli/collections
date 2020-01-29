package aplicacao.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExemplo {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        for (Integer obj : lista) {
            System.out.println(obj);
        }
        System.out.println(lista.indexOf(20));
    }

}
