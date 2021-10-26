package br.com.home.comparadores;

import br.com.home.models.Pessoa;

import java.util.Comparator;

public class PessoaTamanhoNomeComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        //0: p1 == p2
        if (p1.getNome().length() == p2.getNome().length()) {
            return 0;
        }
        //-1: p1 < p2
        if (p1.getNome().length() < p2.getNome().length()) {
            return -1;
        }
        //1: p1 > p2
        return 1;
    }
}
