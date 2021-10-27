package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<Pessoa> queue = new PriorityQueue<>();
        queue.add(new Pessoa(3, "pessoa 3"));
        queue.add(new Pessoa(1, "pessoa 1"));
        queue.add(new Pessoa(2, "pessoa 2"));
        System.out.println(queue);
        while (!queue.isEmpty()) {
            Pessoa p = queue.poll();
            System.out.println(p);
        }
    }
}
