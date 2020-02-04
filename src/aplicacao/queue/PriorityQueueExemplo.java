package aplicacao.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExemplo {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();

        queue.add("Roger");
        queue.add("Gabriel");
        queue.add("Jéssica");
        queue.add("Patricia");
        queue.add("Thiago");

        for(Object q : queue){
            System.out.println(q);
        }

        System.out.println("\nRemovido\n");
        queue.poll();
        for(Object q : queue){
            System.out.println(q);
        }
    }
}
