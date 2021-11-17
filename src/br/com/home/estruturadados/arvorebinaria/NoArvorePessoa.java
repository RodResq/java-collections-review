package br.com.home.estruturadados.arvorebinaria;

import br.com.home.estruturadados.models.PessoaEd;

public class NoArvorePessoa extends NoArvore<PessoaEd> {

    public NoArvorePessoa(PessoaEd valor) {
        super(valor);
    }

    @Override
    public int peso() {
        return this.valor.getId();
    }

}
