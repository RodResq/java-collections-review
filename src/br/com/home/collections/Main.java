package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa(1, "Pessoa 1"));
        pessoas.add(new Pessoa(2, "Pessoa 2"));
        pessoas.add(new Pessoa(3, "Pessoa 3"));
        System.out.println("Com for");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            System.out.println(p);
        }

        System.out.println("Com Iterator");
        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
//        while (iteratorPessoa.hasNext()) {
//            Pessoa p = iteratorPessoa.next();
//            if(p.getId() == 1) {
//                iteratorPessoa.remove();
////                pessoas.remove(p);
//            }
//            System.out.println(p);
//        }
        pessoas.removeIf(p -> p.getId() == 1);
        // O java ultiliza os iterators por baixo dos panos
        System.out.println("Com for-each");
        for (Pessoa p: pessoas) {
            System.out.println(p);
        }

        System.out.println("FIM!");
    }
}
