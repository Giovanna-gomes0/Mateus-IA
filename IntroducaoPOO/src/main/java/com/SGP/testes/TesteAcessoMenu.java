package com.sgp.testes;

import java.util.Scanner;

import com.sgp.modelos.Atleta;
import com.sgp.util.Validacoes;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atleta atleta = new Atleta("Isadora", 20);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(atleta.toString());
                    break;
                case 2:
                    alterarNome(atleta, scanner);
                    break;
                case 3:
                    alterarIdade(atleta, scanner);
                    break;
                case 4:
                    atleta.saudacao();
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu do Atleta ===");
        System.out.println("1. Mostrar dados do atleta");
        System.out.println("2. Alterar nome do atleta");
        System.out.println("3. Alterar idade do atleta");
        System.out.println("4. Mostrar apresentação do atleta");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Atleta atleta, Scanner scanner) {
        System.out.print("Digite o novo nome do atleta: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            atleta.setNome(novoNome);
            System.out.println("Nome do atleta alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarIdade(Atleta atleta, Scanner scanner) {
        System.out.print("Digite a nova idade do atleta: ");
        try {
            int novaIdade = Integer.parseInt(scanner.nextLine());
            if (Validacoes.idadeValida(novaIdade)) {
                atleta.setIdade(novaIdade);
                System.out.println("Idade do atleta alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroIdade(novaIdade));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
        }
    }

}