package org.controller;

import org.model.Tarefa;

import java.util.ArrayList;

// --------------------------------------------------------------------------------------------------------------------

public class GerenciadorTarefas {

    private ArrayList<Tarefa> listaDeTarefas;

    public GerenciadorTarefas() {
        listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo, String descricao, String prioridade) {

        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase((titulo))) {

                System.out.println("Já existe uma Tarefa com este Título !");
                return;

            }
        }

        Tarefa tarefa = new Tarefa(titulo, descricao, prioridade);
        listaDeTarefas.add(tarefa);
        System.out.println("Tarefa adicionada com Sucesso !");


    }

    public void listarTarefas() {

        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada !");
        } else {

            int contador = 1;

            for (Tarefa tarefa : listaDeTarefas) {
                System.out.println("Tarefa número: " + contador);
                System.out.println(" ---------------------------------------------- ");
                System.out.println("Título: " + tarefa.getTitulo());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println(" ---------------------------------------------- ");
                contador++;
            }

            System.out.println("Total de Tarefas: " + listaDeTarefas.size());

        }
    }

    public void removerTarefa(String titulo) {

        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada");
            return;
        }

        boolean removido = listaDeTarefas.removeIf(tarefa -> tarefa.getTitulo().equalsIgnoreCase(titulo));

        if (removido) {
            System.out.println("Tarefa removida com sucesso!");
            System.out.println(" ---------------------------------------------- ");
        } else {

            System.out.println("Nenhuma tarefa encontrada com este título!");
        }
    }

    public void buscarTarefa(String titulo) {

        if (listaDeTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa Cadastrada!");
            return;
        }

        for (Tarefa tarefa : listaDeTarefas) {

            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(" ---------------------------------------------- ");
                System.out.println("Título: " + tarefa.getTitulo());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println(" ---------------------------------------------- ");
                return;
            }

        }

        System.out.println("Nenhuma tarefa encontrada com este título!");

    }
}


