package aplicacao.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExemplo {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("tres", 3);
        mapa.put("quatro", 4);

        Set<String> chaves = mapa.keySet();

        for (String c : chaves){
            System.out.println(c);
        }


    }
}
