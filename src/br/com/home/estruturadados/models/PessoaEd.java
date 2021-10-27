package br.com.home.estruturadados.models;

public class PessoaEd {
    private int id;
    private String nome;

    public PessoaEd(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaEd{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
