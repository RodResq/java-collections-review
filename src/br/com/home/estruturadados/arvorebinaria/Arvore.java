package br.com.home.estruturadados.arvorebinaria;

public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return this.raiz;
    }

    public void inserir(NoArvore<T> no) {
        no.setNoDireito(null);
        no.setNoEsquerdo(null);
        if (this.raiz == null) {
            this.raiz = no;
        } else if (this.raiz.peso() < no.peso()) {
            this.raiz.setNoDireito(no);
        }
    }

    private void inserir(NoArvore<T> ref, NoArvore<T> novoNo) {
        if (ref.peso() < novoNo.peso()) {
            if (ref.getNoDireito() == null) {
                ref.setNoDireito(novoNo);
            }else {
                inserir(ref.getNoDireito(), novoNo);
            }
        } else {
            if (ref.getNoEsquerdo() == null) {
                ref.setNoEsquerdo(novoNo);
            } else {
                inserir(ref.getNoEsquerdo(), novoNo);
            }
        }
    }
}
