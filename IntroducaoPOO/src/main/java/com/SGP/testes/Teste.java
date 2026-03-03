package com.sgp.testes; // Declaração do pacote

import com.sgp.modelos.Atleta;

public class Teste { // Definição da classe Teste

    public static void main(String[] args) {
        // Testando o método com um atleta não inicializado
        Atleta atletaNaoInicializado = null;
        imprimirAtleta(atletaNaoInicializado);

        // Testando o método com um atleta inicializado
        Atleta atletaPrincipal = new Atleta("Rafaela", 25);
        imprimirAtleta(atletaPrincipal);

        // Testando o construtor com valores padrão
        Atleta atletaPadrao = new Atleta();
        System.out.println("\nTestando construtor com valores padrão:");
        imprimirAtleta(atletaPadrao);

        // Acesso ao método público
        atletaPrincipal.saudacao();

        // Acessando o atributo através do getter público
        System.out.println("Nome do atleta: " + atletaPrincipal.getNome());

        // Modificando o atributo privado através do setter
        atletaPrincipal.setNome("Gabriel");
        System.out.println("Nome atualizado do atleta: " + atletaPrincipal.getNome());

        // Modificando a idade através do setter
        atletaPrincipal.setIdade(28);
        System.out.println("Atleta após modificações: " + atletaPrincipal.toString());
    }

    // Método estático para imprimir informações de um atleta
    public static void imprimirAtleta(Atleta atleta) {
        if (atleta == null) {
            System.out.println("Atleta não foi inicializado!");
            return;
        }
        System.out.println(atleta);
        atleta.saudacao();
    }
}