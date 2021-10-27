package br.com.home.collections;

import br.com.home.comparadores.PessoaTamanhoNomeComparator;
import br.com.home.models.Pessoa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(3, "Pessoa 3"));
        pessoas.add(new Pessoa(1, "Pessoa1"));
        pessoas.add(new Pessoa(2, "Pes 2"));

        System.out.println("Antes da Ordenacao");
        System.out.println(pessoas);
//        Collections.sort(pessoas);
//        Collections.sort(pessoas, new PessoaTamanhoNomeComparator());
//        Collections.sort(pessoas, (p1, p2) -> {
//            if (p1.getNome().length() == p2.getNome().length()) {
//                return 0;
//            }else if (p1.getNome().length() < p2.getNome().length()) {
//                return -1;
//            }else {
//                return 1;
//            }
//        });
//        pessoas.sort((p1, p2) -> {
//            if (p1.getNome().length() == p2.getNome().length()) {
//                return 0;
//            }else if (p1.getNome().length() < p2.getNome().length()) {
//                return -1;
//            }else {
//                return 1;
//            }
//        });
//        pessoas.sort(Comparator.comparingInt(Pessoa::getId));
//        pessoas.sort(Comparator.comparing(Pessoa::getNome,(p1,p2) -> {
//            if (p1.length() == p2.length()) {
//                return 0;
//            }else if (p1.length() < p2.length()) {
//                return -1;
//            }
//                return 1;
//        }));
//        pessoas.sort(Comparator.naturalOrder());
        pessoas.sort(Comparator.reverseOrder());
        System.out.println("Depois da Ordenacao");
        System.out.println(pessoas);

//        System.out.println("Com for");
//        for (int i = 0; i < pessoas.size(); i++) {
//            Pessoa p = pessoas.get(i);
//            System.out.println(p);
//        }
//
//        System.out.println("Com Iterator");
//        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
//        while (iteratorPessoa.hasNext()) {
//            Pessoa p = iteratorPessoa.next();
//            if(p.getId() == 1) {
//                iteratorPessoa.remove();
////                pessoas.remove(p);
//            }
//            System.out.println(p);
//        }
//        pessoas.removeIf(p -> p.getId() == 1);
        // O java ultiliza os iterators por baixo dos panos
//        System.out.println("Com for-each");
//        for (Pessoa p: pessoas) {
//            System.out.println(p);
//        }

        System.out.println("FIM!");
    }
}
