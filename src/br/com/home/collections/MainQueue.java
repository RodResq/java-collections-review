package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<Pessoa> queue = new PriorityQueue<Pessoa>((p1, p2) -> {
            return p1.getNome().compareTo(p2.getNome());
        });
        queue.add(new Pessoa(3, "Mauro 3"));
        queue.add(new Pessoa(1, "Cassia 1"));
        queue.add(new Pessoa(2, "Abel 2"));
        System.out.println(queue);
        while (!queue.isEmpty()) {
            Pessoa p = queue.poll();
            System.out.println(p);
        }
    }
}
