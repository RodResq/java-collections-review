package br.com.home.collections;

import br.com.home.models.Pessoa;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class MainHashTable {

    public static void main(String[] args) {
        Hashtable<String, Pessoa> tabelaPessoas = new Hashtable<>(20, 0.6f);
        tabelaPessoas.put("legal", new Pessoa(1, "pessoa 1"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.put("chata", new Pessoa(2, "pessoa 2"));
        System.out.println(tabelaPessoas);
        System.out.println(tabelaPessoas.get("legal"));
        tabelaPessoas.put("legal", new Pessoa(3, "pessoa 3"));
        System.out.println(tabelaPessoas.get("legal"));
        tabelaPessoas.put("bla", new Pessoa(4, "pessoa 4"));
//      Iterator
//        Fail-Fast Iterator
//        Iterator<String> iteratorChave = tabelaPessoas.keySet().iterator();
//        tabelaPessoas.remove("legal");
//        while (iteratorChave.hasNext()) {
//            String chave = iteratorChave.next();
//            System.out.println(" - " + tabelaPessoas.get(chave).toString());
//        }
//        Non Fail-Fast Iterator
        Enumeration<String> chaves = tabelaPessoas.keys();
        tabelaPessoas.remove("legal");
        while (chaves.hasMoreElements()) {
            String chave = chaves.nextElement();
            System.out.println(" - " + tabelaPessoas.get(chave).toString());
        }
//        Pessoa p = null;
//        if (tabelaPessoas.containsKey("legal")) {
//            p = tabelaPessoas.get("legal");
//        }else {
//            p = new Pessoa(-1, "Nao Existe");
//        }
//        System.out.println(p);
        Pessoa p = tabelaPessoas.getOrDefault("legal", new Pessoa(-1, "Nao Existe"));
        System.out.println(p);

//        if (!tabelaPessoas.containsKey("legal")) {
//            tabelaPessoas.put("1", new Pessoa(1, "TreinaWeb"));
//        }
//        System.out.println(tabelaPessoas);

        tabelaPessoas.putIfAbsent("legal", new Pessoa(1, "TreinaWeb X"));
        System.out.println(tabelaPessoas);

        tabelaPessoas.forEach((chave, valor) -> {
            System.out.println(String.format("[%s] %s", chave, valor));
        });

    }
}
