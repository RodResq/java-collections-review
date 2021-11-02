package br.com.home.estruturadados.pilhas;

import br.com.home.estruturadados.listasligadas.ListaDuplamenteLigada;

public class Pilha<T> {

    private ListaDuplamenteLigada<T> elementos;

    public Pilha() {
        this.elementos = new ListaDuplamenteLigada<T>();
    }
}
