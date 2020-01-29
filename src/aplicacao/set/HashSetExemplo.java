package aplicacao.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExemplo {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(3);
        conjunto.add(1);
        conjunto.add(1);
        conjunto.add(3);
        conjunto.add(2);

        for(Integer c : conjunto){
            System.out.println(c);
        }
    }
}
