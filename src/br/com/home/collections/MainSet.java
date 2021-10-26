package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {
        Set<Pessoa> set = new TreeSet<Pessoa>((p1, p2) -> {
            return p1.getNome().compareTo(p2.getNome());
        });
        set.add(new Pessoa(2, "Beka 2"));
        set.add(new Pessoa(3, "Pessoa 3"));
        set.add(new Pessoa(1, "Abel 1"));
//        set.add(null);
        System.out.println(set);
        for (Pessoa p: set) {
            System.out.println(p);
        }
    }
}
