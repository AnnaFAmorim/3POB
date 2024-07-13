package br.edu.faeterj;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class Processamento {

    public Processamento() throws SQLException {
    }

    public void incluirCliente(Scanner scanner) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ConnectionFactory cf = new ConnectionFactory();
        Connection conn = cf.createConnection();

        System.out.print(" Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Email:  ");
        String email = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("CEP : ");
        String cep = scanner.nextLine();

        String sql = "INSERT INTO clientes (nome, cpf, email, endereco,  cep) VALUES ('" + nome + "', '" + cpf + "', '" + email + "', '" + endereco + "', '" + cep + "')";
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        System.out.println("CLIENTE INCLUIDO!");
    }

    public void alterarCliente(Scanner scanner) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ConnectionFactory cf = new ConnectionFactory();
        Connection conn = cf.createConnection();

        System.out.print("ID do cliente que deseja altera : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Novo Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Novo CPF: ");
        String cpf = scanner.nextLine();

        String sql = "UPDATE clientes SET endereco = '" + endereco + "', cpf = '" + cpf + "' WHERE id = " + id;
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        System.out.println("CLIENTE ALTERADO!");
    }

    public void excluirCliente(Scanner scanner) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ConnectionFactory cf = new ConnectionFactory();
        Connection conn = cf.createConnection();

        System.out.print("ID do Cliente que deseja excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "DELETE FROM clientes WHERE id = " + id;
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        System.out.println("CLIENTE EXCLUIDO!");
    }

    public void listarClientes() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ConnectionFactory cf = new ConnectionFactory();
        Connection conn = cf.createConnection();

        String sql = "SELECT * FROM clientes";
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = stmt.executeQuery(sql);
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String cpf = resultSet.getString("cpf");
            String email = resultSet.getString("email");
            String endereco = resultSet.getString("endereco");
            String cep = resultSet.getString("cep");
            Cliente cliente = new Cliente(id, nome, cpf, email, endereco, cep);
            listaClientes.add(cliente);
            System.out.println(cliente);
        }
    }
}

