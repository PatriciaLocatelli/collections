package aplicacao.list;

import java.util.Stack;

public class StackExemplo {
    public static void main(String[] args) {
        Stack pilha = new Stack();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("Imprime a pilha");
        for (Object p : pilha) {
            System.out.println(p);
        }

        pilha.pop();
        System.out.println("Retirado o último elemento da pilha");
        for (Object p : pilha) {
            System.out.println(p);
        }
    }
}
