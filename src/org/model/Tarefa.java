package org.model;

// --------------------------------------------------------------------------------------------------------------------

public class Tarefa {

    private String titulo;
    private String descricao;
    private String prioridade;

    public Tarefa(String titulo, String descricao, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
    return "Título: " + titulo + "\n" +
           "Descrição: " + descricao + "\n" +
           "Prioridade: " + prioridade + "\n" +
           "-----------------------------";
    }
}
