package com.sgp.modelos;  // Declaração do pacote

public class Atleta {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Atleta
    private int idade;  // Atributo privado, acessível somente dentro da classe Atleta

    // Construtor que recebe nome e idade como parâmetros
    public Atleta(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor sobrecarregado que recebe apenas o nome
    // Inicializa com valores padrão: nome="Isadora" e idade=20
    public Atleta() {
        this.nome = "Isadora";
        this.idade = 20;
    }

    // Método que exibe uma mensagem de apresentação do atleta
    public void saudacao() {
        System.out.println("Olá, eu sou o atleta " + nome + " e tenho " + idade + " anos.");
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o nome do atleta
    public String getNome() {
        return nome;
    }

    // Retorna a idade do atleta
    public int getIdade() {
        return idade;
    }

    // Define um novo nome para o atleta
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define uma nova idade para o atleta
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Atleta [nome=" + nome + ", idade=" + idade + "]";
    }
}