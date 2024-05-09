package br.com.loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Produto> produtos = new ArrayList<>();
    private static int proximoId = 1;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n      MENU      ");
            System.out.println("1 INLCUIR");
            System.out.println("2 ALTERAR");
            System.out.println("3 EXCLUIR");
            System.out.println("4 LISTAR TODOS");
            System.out.println("5 LISTAR UNIDADE");
            System.out.println("6 SAIR");
            System.out.print("Opção escolhida: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    incluirProduto();
                    break;
                case 2:
                    alterarProduto();
                    break;
                case 3:
                    excluirProduto();
                    break;
                case 4:
                    listarTodosProdutos();
                    break;
                case 5:
                    listarUmProduto();
                    break;
                case 6:
                    System.out.println("Encerrado com sucesso!...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private static void incluirProduto() {
        System.out.println("\n     INCLUIR      ");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("SKU: ");
        String sku = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Fabricante: ");
        String fabricante = scanner.nextLine();

        Produto produto = new Produto(proximoId++, codigo, sku, nome, descricao, categoria, preco, peso, fabricante);
        produtos.add(produto);
        System.out.println("inclusão feita com sucesso!");
    }

    private static void alterarProduto() {
        System.out.println("\n     ALTERAR      ");
        System.out.print("Entre com o ID do produto que deseja ser ALTERADO: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produto = encontrarProdutoPorId(id);
        if (produto != null) {
            System.out.println("Entre com os novos dados:");
            System.out.print("Código [" + produto.getCodigo() + "]: ");
            String codigo = scanner.nextLine();
            if (!codigo.isEmpty()) {
                produto.setCodigo(codigo);
            }
                 System.out.println("Produto alterado!!!");
        } else {
            System.out.println("Produto NÃO encontrado!");
        }
    }

    private static void excluirProduto() {
        System.out.println("\n     EXCLUIR      ");
        System.out.print("Entre com o ID do produto que deseja ser EXCLUIDO: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produto = encontrarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluído!!!");
        } else {
            System.out.println("Produto NÃO encontrado!");
        }
    }

    private static void listarTodosProdutos() {
        System.out.println("\n      LISTA DE TODOS OS PRODUTOS:     ");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private static void listarUmProduto() {
        System.out.println("\n    LISTAR UM PRODUTO     ");
        System.out.print("Entre com o ID do produto que deseja ser LISTADO: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produto = encontrarProdutoPorId(id);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static Produto encontrarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}