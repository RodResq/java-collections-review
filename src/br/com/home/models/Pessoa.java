package br.com.home.models;

public class Pessoa implements Comparable<Pessoa> {

    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
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
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (id != pessoa.id) return false;
        return nome != null ? nome.equals(pessoa.nome) : pessoa.nome == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        // 0 : Objetos iguais
        if(this.id == pessoa.getId()) {
            return 0;
        }
        // < 0 : Instancia consierada menor que o argumento
        if (this.id < pessoa.getId()) {
            return -1;
        }
        // > 0 : Instanciam considerada maior que o argumento
        return 1;
    }
}
