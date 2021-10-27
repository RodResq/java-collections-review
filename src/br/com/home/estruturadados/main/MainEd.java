package br.com.home.estruturadados.main;

import br.com.home.estruturadados.models.PessoaEd;

import java.util.Scanner;

public class MainEd {

    public static void main(String[] args) {
        System.out.println("Digite a opcao desejada: ");
        System.out.println("1 - Gerenciamento de Memoria");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
        }
        scanner.close();
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
