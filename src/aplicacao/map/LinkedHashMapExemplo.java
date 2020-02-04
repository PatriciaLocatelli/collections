package aplicacao.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExemplo {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "um");
        map.put(2, "dois");
        map.put(3, "três");
        Collection<String> valores = map.values();
        for (String valor : valores)
            System.out.println(valor);
    }
}
