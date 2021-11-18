package br.com.home.estruturadados.main;

import br.com.home.estruturadados.arvorebinaria.Arvore;
import br.com.home.estruturadados.arvorebinaria.NoArvore;
import br.com.home.estruturadados.arvorebinaria.NoArvorePessoa;
import br.com.home.estruturadados.conjunto.Conjunto;
import br.com.home.estruturadados.filas.Fila;
import br.com.home.estruturadados.listasligadas.ListaLigada;
import br.com.home.estruturadados.mapas.Mapa;
import br.com.home.estruturadados.models.PessoaEd;
import br.com.home.estruturadados.pilhas.Pilha;
import br.com.home.estruturadados.vetores.Vetor;

import java.util.Scanner;

public class MainEd {

    public static void main(String[] args) {
        System.out.println("Digite a opcao desejada: ");
        System.out.println("1 - Gerenciamento de Memoria");
        System.out.println("2 - Vetor");
        System.out.println("3 - Lista Ligada");
        System.out.println("4 - Lista Duplamente Ligada");
        System.out.println("5 - Pilha");
        System.out.println("6 - Fila");
        System.out.println("7 - Conjunto");
        System.out.println("8 - Mapa");
        System.out.println("9 - Arvore Binaria");
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
            case 4:
                fazerListaDuplamenteLigada();
                break;
            case 5:
                fazerPilha();
                break;
            case 6:
                fazerFila();
                break;
            case 7:
                fazerConjunto();
                break;
            case 8:
                fazerMapa();
                break;
            case 9:
                fazerArvore();
                break;
        }
        scanner.close();
    }

    private static void fazerArvore() {
        Arvore<PessoaEd> arvorePessoa = new Arvore<>();
        System.out.println(arvorePessoa);
        arvorePessoa.inserir(new NoArvorePessoa(new PessoaEd(5, "Pessoa 5")));
        System.out.println(arvorePessoa);
        arvorePessoa.inserir(new NoArvorePessoa(new PessoaEd(4, "Pessoa 4")));
        System.out.println(arvorePessoa);
        arvorePessoa.inserir(new NoArvorePessoa(new PessoaEd(6, "Pessoa 6")));
        System.out.println(arvorePessoa);
        arvorePessoa.inserir(new NoArvorePessoa(new PessoaEd(7, "Pessoa 7")));
        System.out.println(arvorePessoa);
        System.out.println("Busca ...");
        NoArvore<PessoaEd> noPessoa6 = new NoArvorePessoa(new PessoaEd(6, "Pessoa 7"));
        NoArvore<PessoaEd> noPessoa1 = new NoArvorePessoa(new PessoaEd(1, "Pessoa 1"));
        System.out.println(arvorePessoa.Buscar(noPessoa6));
        System.out.println(arvorePessoa.Buscar(noPessoa1));
    }

    private static void fazerMapa() {
        Mapa<String, PessoaEd> mapaPessoas = new Mapa<>();
        System.out.println(mapaPessoas.toString());
        mapaPessoas.adcionar("Legal", new PessoaEd(1, "pessoa 1"));
        System.out.println(mapaPessoas);
        System.out.println(mapaPessoas.contemChave("Legal"));
        System.out.println(mapaPessoas.contemChave("Chata"));
        mapaPessoas.adcionar("Chata", new PessoaEd(2, "pessoa 2"));
        System.out.println(mapaPessoas.contemChave("Chata"));
        mapaPessoas.adcionar("Legal", new PessoaEd(3, "pessoa Editado"));
        System.out.println(mapaPessoas);
        mapaPessoas.remover("Chata");
        System.out.println(mapaPessoas);
        mapaPessoas.remover("chave");

    }

    private static void fazerConjunto() {
        Conjunto<PessoaEd> conjuntoPessoas = new Conjunto<PessoaEd>();
        System.out.println(conjuntoPessoas);
        System.out.println(conjuntoPessoas.inserir(new PessoaEd(1, "Pessoa 1")));
        System.out.println(conjuntoPessoas);
        System.out.println(conjuntoPessoas.inserir(new PessoaEd(1, "Pessoa 1")));
        System.out.println(conjuntoPessoas);

    }

    private static void fazerFila() {
        Fila<PessoaEd> filaPessoas = new Fila<PessoaEd>();
        System.out.println(filaPessoas.estaVazia());
        filaPessoas.enfileirar(new PessoaEd(1, "Pessoa 1"));
        filaPessoas.enfileirar(new PessoaEd(2, "Pessoa 2"));
        System.out.println(filaPessoas);
        PessoaEd p = filaPessoas.desenfileirar();
        System.out.println(p);
        System.out.println(filaPessoas);
    }

    private static void fazerPilha() {
        Pilha<PessoaEd> pilhaPessoas = new Pilha<PessoaEd>();
        System.out.println(pilhaPessoas.estaVazia());
        pilhaPessoas.empilhar(new PessoaEd(1, "Pessoa 1"));
        pilhaPessoas.empilhar(new PessoaEd(2, "Pessoa 2"));
        pilhaPessoas.empilhar(new PessoaEd(3, "Pessoa 3"));
        PessoaEd p1 = pilhaPessoas.desempilhar();
        System.out.println(p1);

    }

    private static void fazerListaDuplamenteLigada() {
        ListaLigada<PessoaEd> listaPessoas = new ListaLigada<PessoaEd>();
        listaPessoas.inserir(new PessoaEd(1, "Pessoa 1"));
        listaPessoas.inserir(new PessoaEd(2, "Pessoa 2"));
        listaPessoas.inserir(new PessoaEd(3, "Pessoa 3"));
        listaPessoas.inserirEm(1, new PessoaEd(4, "Pessoa 4"));
        listaPessoas.inserirPrimeiro(new PessoaEd(5, "Pessoa 5"));
        listaPessoas.inserirUltimo(new PessoaEd(6, "Pessoa 6"));
        System.out.println(listaPessoas.toString());
        PessoaEd p = listaPessoas.recuperar(1);
        PessoaEd pessoaErrada = new PessoaEd(100, "Pessoa Errada");
        System.out.println(listaPessoas.contem(p));
        System.out.println(listaPessoas.contem(pessoaErrada));
        System.out.println(listaPessoas.indice(p));
        System.out.println(listaPessoas.indice(pessoaErrada));
        listaPessoas.remover(p);
        System.out.println(listaPessoas);
        listaPessoas.remover(0);
        System.out.println(listaPessoas);
        for (int i = 0; i < listaPessoas.tamanho(); i++) {
            System.out.println(listaPessoas.recuperar(i));
        }
    }

    private static void fazerListaLigada() {
        ListaLigada<PessoaEd> listaPessoas = new ListaLigada<PessoaEd>();
        listaPessoas.inserir(new PessoaEd(1, "Pessoa 1"));
        listaPessoas.inserir(new PessoaEd(2, "Pessoa 2"));
        listaPessoas.inserir(new PessoaEd(3, "Pessoa 3"));
        listaPessoas.inserirEm(1, new PessoaEd(4, "Pessoa 4"));
        listaPessoas.inserirPrimeiro(new PessoaEd(5, "Pessoa 5"));
        listaPessoas.inserirUltimo(new PessoaEd(6, "Pessoa 6"));
        System.out.println(listaPessoas.toString());
        PessoaEd p = listaPessoas.recuperar(1);
        PessoaEd pessoaErrada = new PessoaEd(100, "Pessoa Errada");
        System.out.println(listaPessoas.contem(p));
        System.out.println(listaPessoas.contem(pessoaErrada));
        System.out.println(listaPessoas.indice(p));
        System.out.println(listaPessoas.indice(pessoaErrada));
        listaPessoas.remover(p);
        System.out.println(listaPessoas);
        listaPessoas.remover(0);
        System.out.println(listaPessoas);
        for (int i = 0; i < listaPessoas.tamanho(); i++) {
            System.out.println(listaPessoas.recuperar(i));
        }
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
