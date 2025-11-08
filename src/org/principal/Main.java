package org.principal;
import org.controller.GerenciadorTarefas;
import org.model.Tarefa;

import java.util.Scanner;

// --------------------------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        while (true) {

            System.out.println("-------------------- Bem-Vindo ao Programa Controle de Tarefas!! --------------------");
            System.out.println("Digite a opção desejada: ");
            System.out.println("[1] - Adicionar tarefa");
            System.out.println("[2] - Listar Tarefas");
            System.out.println("[3] - Buscar Tarefas");
            System.out.println("[4] - Remover Tarefas");
            System.out.println("[0] - Finalizar Programa");
            System.out.println("----------------------------------------");


            System.out.println("Digite a Opção desejada: ");
            String opcao = entrada.nextLine();

            if (opcao.equals("1")) {

                System.out.println("Digite o Título da Tarefa: ");
                String titulo = entrada.nextLine();

                System.out.println("Digite a Descrição da Tarefa: ");
                String descricao = entrada.nextLine();

                System.out.println("Digite a Prioridade da Tarefa: ");
                String prioridade = entrada.nextLine();

                gerenciador.adicionarTarefa(titulo, descricao, prioridade);

                System.out.println("Voltando ao Menu Principal...");

            } else if (opcao.equals("2")) {

                System.out.println("----------------------------------------");
                gerenciador.listarTarefas();
                System.out.println("----------------------------------------");

            } else if (opcao.equals("3")) {

                System.out.println("Digite o título da tarefa que deseja buscar: ");
                String titulo = entrada.nextLine();

                System.out.println("----------------------------------------");
                gerenciador.buscarTarefa(titulo);
                System.out.println("----------------------------------------");

            } else if (opcao.equals("4")) {

                System.out.println("Digite o Título da Tarefa que quer remover: ");
                String titulo = entrada.nextLine();

                gerenciador.removerTarefa(titulo);

            } else if (opcao.equals("0")) {

                System.out.println("Encerrando o Programa. Até a Próxima !!!");
                break;

            } else {

                System.out.println("Inválido! Tente Novamente !");

            }
        }
    }
}