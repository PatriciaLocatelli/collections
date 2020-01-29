package aplicacao.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExemplo {
    public static void main(String[] args) {
        Set<String> cidades = new LinkedHashSet<>();

        cidades.add("Porto Alegre");
        cidades.add("Canoas");
        cidades.add("Alvorada");
        cidades.add("Viamão");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
