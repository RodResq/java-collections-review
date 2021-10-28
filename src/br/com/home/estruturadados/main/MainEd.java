package br.com.home.estruturadados.main;

import br.com.home.estruturadados.listasligadas.ListaLigada;
import br.com.home.estruturadados.models.PessoaEd;
import br.com.home.estruturadados.vetores.Vetor;

import java.util.Scanner;

public class MainEd {

    public static void main(String[] args) {
        System.out.println("Digite a opcao desejada: ");
        System.out.println("1 - Gerenciamento de Memoria");
        System.out.println("2 - Vetor");
        System.out.println("3 - Lista Ligada");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
            case 2:
                fazerVetor();
                break;
            case 3:
                fazerListaLigada();
                break;
        }
        scanner.close();
    }

    private static void fazerListaLigada() {
        ListaLigada<PessoaEd> listaPessoas = new ListaLigada<PessoaEd>();
        listaPessoas.inserir(new PessoaEd(1, "Pessoa 1"));
        listaPessoas.inserir(new PessoaEd(2, "Pessoa 2"));
        System.out.println(listaPessoas.toString());
    }

    private static void fazerVetor() {
        Vetor<PessoaEd> vetorPessoa = new Vetor<>();
        vetorPessoa.inserir(new PessoaEd(1, "Pessoa 1"));
        vetorPessoa.inserir(new PessoaEd(2, "Pessoa 2"));
        vetorPessoa.inserir(new PessoaEd(3, "Pessoa 3"));
        vetorPessoa.inserir(new PessoaEd(4, "Pessoa 4"));
        vetorPessoa.inserirEm(1, new PessoaEd(5, "Pessoa 5"));
        System.out.println(vetorPessoa);
        System.out.println("Lista de Pesooas: ");
        for (int i = 0; i < vetorPessoa.tamanho(); i++) {
            System.out.println(vetorPessoa.recuperar(i).getNome());
        }

        PessoaEd p = vetorPessoa.recuperar(1);
        PessoaEd pessoaErrada = new PessoaEd(100, "TreinaWeb 100");
        System.out.println(vetorPessoa.contem(p));
        System.out.println(vetorPessoa.contem(new PessoaEd(100, "TreinaWeb 100")));
        System.out.println(vetorPessoa.indice(p));
        System.out.println(vetorPessoa.indice(pessoaErrada));

//        vetorPessoa.remover(2);
        System.out.println(vetorPessoa);

        vetorPessoa.remover(p);
        System.out.println(vetorPessoa.toString());

    }

    private static void fazerGerenciamentoMemoria() {
        int a = 3;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        b = 2;
        System.out.println(" ------------------- ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println("**********************");
        PessoaEd p1 = new PessoaEd(1, "TreinaWeb");
        System.out.println(p1);
        PessoaEd p2 = p1;
        System.out.println(p2);
        System.out.println("======================");
        p2.setNome("Tw modificado");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
    }
}
