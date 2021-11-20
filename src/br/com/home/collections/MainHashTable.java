package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.Hashtable;

public class MainHashTable {

    public static void main(String[] args) {
        Hashtable<String, Pessoa> tabelaPessoas = new Hashtable<>();
        tabelaPessoas.put("legal", new Pessoa(1, "pessoa 1"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.put("chata", new Pessoa(2, "pessoa 2"));
        System.out.println(tabelaPessoas);
        System.out.println(tabelaPessoas.get("legal"));
        tabelaPessoas.put("legal", new Pessoa(3, "pessoa 3"));
        System.out.println(tabelaPessoas.get("legal"));
    }
}
