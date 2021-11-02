package br.com.home.estruturadados.listasligadas;


public class ListaDuplamenteLigada<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public ListaDuplamenteLigada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void inserir(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (estaVazia()) {
            novoNo.setProximo(this.primeiroNo);
            this.primeiroNo.setAnterior(novoNo);
            this.primeiroNo = novoNo;
        } else {
            this.ultimoNo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimoNo);
            this.ultimoNo = novoNo;
        }
        this.tamanho++;
    }

    public T recuperar(int posicao) {
       No<T> no = recuperarNo(posicao);
       if (no != null) {
           return no.getElemento();
       }
       return null;
    }

    public void inserirEm(int posicao, T elemento) {
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException(String.format("Posicao Invalida [%d]", posicao));
        }
        if (posicao == 0) {
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(this.primeiroNo);
            this.primeiroNo.setAnterior(novoNo);
            this.primeiroNo = novoNo;
        } else if (posicao == this.tamanho -1) {
            No<T> novoNo = new No<>(elemento);
            this.ultimoNo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimoNo);
            this.ultimoNo = novoNo;
        } else {
            No<T> noAnterior = recuperarNo(posicao -1);
            No<T> noAtual = recuperarNo(posicao);
            No<T> novoNo = new No<>(elemento);
            noAnterior.setProximo(novoNo);
            novoNo.setProximo(noAtual);
            noAtual.setAnterior(novoNo);
            novoNo.setAnterior(noAnterior);
        }
        this.tamanho++;
    }

    public void inserirPrimeiro(T elemento) {
        this.inserirEm(0, elemento);
    }

    public void inserirUltimo(T elemento) {
        this.inserirEm(this.tamanho -1, elemento);
    }

    private No<T> recuperarNo(int posicao) {
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException(String.format("Posicao Invalida [%d]", posicao));
        }
        No<T> resultado = null;
        for (int i = 0; i <= posicao; i++) {
            if (i == 0) {
                resultado = this.primeiroNo;
            } else {
                resultado = resultado.getProximo();
            }
        }
        return resultado;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean contem(T elemento) {
       for (int i = 0; i < tamanho(); i++) {
           No<T> noAtual = recuperarNo(i);
           if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
               return true;
           }
       }
        return false;
    }

    public int indice(T elemento) {
        for (int i = 0; i < tamanho(); i++) {
            No<T> noAtual = recuperarNo(i);
            if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remover(int posicao) {
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException(String.format("Posicao invalida [%d]", posicao));
        }
        if (posicao == 0) {
            No<T> proximoNo = this.primeiroNo.getProximo();
            this.primeiroNo.setProximo(null);
            primeiroNo.setAnterior(null);
            this.primeiroNo = proximoNo;
        } else if (posicao == tamanho() -1) {
            No<T> penultimoNo = recuperarNo(tamanho() -1);
            penultimoNo.setProximo(null);
            this.ultimoNo.setAnterior(null);
            this.ultimoNo = penultimoNo;
        } else {
            No<T> noAtual = recuperarNo(posicao);
            No<T> noAnterior = noAtual.getAnterior();
            No<T> proximoNo = noAtual.getProximo();
            noAnterior.setProximo(proximoNo);
            proximoNo.setAnterior(noAnterior);
            noAtual.setProximo(null);
            noAtual.setAnterior(null);
        }
        this.tamanho--;
    }

    public void remover(T elemento) {
        int indice = indice(elemento);
        if (indice == -1) {
            throw new IllegalArgumentException("Elemento Invalido - " + elemento.toString());
        }
        remover(indice);
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "Lista []";
        } else {
            No<T> noAtual = this.primeiroNo;
            StringBuilder sb = new StringBuilder();
            sb.append("Lista [");
            sb.append(noAtual.getProximo() != null ? noAtual.getElemento().toString() : "<NULO>");
            sb.append(",");
            while (noAtual.getProximo() != null) {
                sb.append(noAtual.getProximo() != null ? noAtual.getProximo().getElemento().toString() : "<NULO>");
                sb.append(",");
                noAtual = noAtual.getProximo();
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
