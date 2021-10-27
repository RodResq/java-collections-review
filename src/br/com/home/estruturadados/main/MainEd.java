package br.com.home.estruturadados.main;

import br.com.home.estruturadados.models.PessoaEd;

import java.util.Scanner;

public class MainEd {

    public static void main(String[] args) {
        System.out.println("Digite a opcao desejada: ");
        System.out.println("1 - Gerenciamento de Memoria");
        System.out.println("2 - Vetor");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
            case 2:
                fazerVetor();
                break;
        }
        scanner.close();
    }

    private static void fazerVetor() {
        PessoaEd[] vetorPessoas = new PessoaEd[3];
        vetorPessoas[0] = new PessoaEd(1, "Pessoa 1 no Vetor");
        System.out.println(vetorPessoas[0].getNome());
        System.out.println(vetorPessoas[1]);
        int[] vetorInteiros = new int[3];
        System.out.println(vetorInteiros[0]);
        System.out.println(vetorInteiros[3]);
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
