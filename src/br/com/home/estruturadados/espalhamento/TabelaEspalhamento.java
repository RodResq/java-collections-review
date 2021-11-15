package br.com.home.estruturadados.espalhamento;

import br.com.home.estruturadados.listasligadas.ListaLigada;

public class TabelaEspalhamento<T> {

    private ListaLigada<ListaLigada<T>> elementos;
    private int numeroCategorias = 16;
    private int tamanho = 0;


    public TabelaEspalhamento() {
        this.elementos = new ListaLigada<ListaLigada<T>>();
        for (int i = 0; i < this.numeroCategorias; i++) {
            this.elementos.inserir(new ListaLigada<T>());
        }
    }

    public boolean inserrir(T elemento) {
        if (elementos == null || this.contem(elemento)) {
            return false;
        }
        int numeroEspalhamento = this.gerarNumeroEspalhamento(elemento);
        ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
        categoria.inserir(elemento);
        this.tamanho++;
        return true;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean contem(T elemento) {
        int numeroEspalhamento = this.gerarNumeroEspalhamento(elemento);
        ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
        return categoria.contem(elemento);
    }

    public void remover(T elemento) {
        int numeroEspalhamento = this.gerarNumeroEspalhamento(elemento);
        ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
        categoria.remover(elemento);
        this.tamanho--;
    }

    private int gerarNumeroEspalhamento(T elemento) {
        return Math.abs(elemento.hashCode() % this.numeroCategorias);
    }

    @Override
    public String toString() {
        return "TabelaEspalhamento[" +
                "elementos=" + elementos +
                ']';
    }
}
