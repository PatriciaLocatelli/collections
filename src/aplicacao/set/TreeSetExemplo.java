package aplicacao.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExemplo {
    public static void main(String[] args) {

        Set<String> cidades = new TreeSet<>();

        cidades.add("Porto Alegre");
        cidades.add("Canoas");
        cidades.add("Alvorada");
        cidades.add("Viamão");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
