public class Tarefa {
    //atributo
    private String descricao;

    // constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return "Tarefa{" +
        "descricao='" + descricao + '\'' +
        '}';
    }
}
