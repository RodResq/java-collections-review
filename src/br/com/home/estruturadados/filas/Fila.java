package br.com.home.estruturadados.filas;

import br.com.home.estruturadados.listasligadas.ListaLigada;

public class Fila<T> {

    private ListaLigada<T> elementos;

    public Fila() {
        this.elementos = new ListaLigada<T>();
    }

    public void enfileirar(T elemento) {
        this.elementos.inserir(elemento);
    }

    public T desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        T resultado = this.elementos.recuperar(0);
        this.elementos.remover(resultado);
        return resultado;
    }

    public boolean estaVazia() {
        return this.elementos.estaVazia();
    }

    @Override
    public String toString() {
        return "Fila{" +
                elementos +
                '}';
    }
}
