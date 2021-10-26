package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, "Pessoa 1"));
        pessoas.add(new Pessoa(2, "Pessoa 2"));
        System.out.println(pessoas.toString());
    }
}
