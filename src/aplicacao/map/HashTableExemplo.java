package aplicacao.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExemplo {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new Hashtable<>();
        mapa.put(4, "d");
        mapa.put(1, "a");
        mapa.put(5, "b");
        mapa.put(2, "c");
        mapa.put(3, "d");

        mapa.forEach((integer, s) -> System.out.println(s));
    }
}
