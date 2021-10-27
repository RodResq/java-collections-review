package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {
        HashSet<Pessoa> pessoas = new HashSet<>();
        pessoas.add(new Pessoa(1, "pessoa 1"));
        pessoas.add(new Pessoa(2, "pessoa 2"));
        pessoas.add(new Pessoa(3, "pessoa 3"));
        pessoas.add(new Pessoa(4, "pessoa 4"));
        pessoas.add(new Pessoa(5, "pessoa 5"));
        pessoas.add(new Pessoa(6, "pessoa 6"));
        pessoas.add(new Pessoa(7, "pessoa 7"));
        pessoas.add(new Pessoa(8, "pessoa 8"));
        pessoas.add(new Pessoa(9, "pessoa 9"));
        pessoas.add(new Pessoa(10, "pessoa 10"));
        pessoas.add(new Pessoa(11, "pessoa 11"));
        pessoas.add(new Pessoa(12, "pessoa 12"));
        pessoas.add(new Pessoa(13, "pessoa 13"));
        pessoas.add(new Pessoa(14, "pessoa 14"));
        pessoas.add(new Pessoa(15, "pessoa 15"));
        pessoas.add(new Pessoa(16, "pessoa 16"));
        pessoas.add(new Pessoa(17, "pessoa 17"));
        pessoas.add(new Pessoa(18, "pessoa 18"));
        pessoas.add(new Pessoa(19, "pessoa 19"));

        System.out.println(pessoas);
    }
}
