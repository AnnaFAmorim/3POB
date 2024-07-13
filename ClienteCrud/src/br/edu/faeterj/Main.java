package br.edu.faeterj;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vou acessar banco MySQL!");
        try {
            Processamento proc = new Processamento();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("-------MENU-------:");
                System.out.println("1 - Incluir Cliente");
                System.out.println("2 - Alterar Cliente");
                System.out.println("3 - Excluir Cliente");
                System.out.println("4 - Listar Clientes");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        proc.incluirCliente(scanner);
                        break;
                    case 2:
                        proc.alterarCliente(scanner);
                        break;
                    case 3:
                        proc.excluirCliente(scanner);
                        break;
                    case 4:
                        proc.listarClientes();
                        break;
                    case 0:
                        System.out.println("SAINDO");
                        return;
                    default:
                        System.out.println("OPÇÃO INVALIDA.");
                }
            }
        } catch (SQLException e) {
            System.out.println("ERRO DE BANCO! " + e.getMessage());
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("ARQUIVO NÃO ENCONTRADO! " + e.getMessage());
            throw new RuntimeException(e);
        }  catch (Exception e) {
            System.out.println("ERRO! " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
