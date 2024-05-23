import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Carrinho carrinho = new Carrinho();
    private ArrayList<ItensCarrinho> itens = new ArrayList<>();
    private ArrayList<Frete> fretes = new ArrayList<>();

    public void processamento() {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        inicializaDados();

        do {
            System.out.println("Digite a opção:");
            System.out.println("1- Incluir Produto: ");
            System.out.println("2- Alterar Produto: ");
            System.out.println("3- Excluir Produto: ");
            System.out.println("4- Listar Produtos: ");
            System.out.println("5- Buscar Produto: ");
            System.out.println("6- Calcular Frete: ");
            System.out.println("7- Sair ");

            opcao = sc.nextInt();

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
                    listarProdutos();
                    break;
                case 5:
                    buscarProduto();
                    break;
                case 6:
                    calcularFrete();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcao != 7);
    }

    private void inicializaDados() {
        Produto prod = new Produto("shampoo", "456789", "sdfrg456", "p/ cabelo", 12.34, 0.500);
        produtos.add(prod);
        prod = new Produto("condicionador", "55555", "ajj555", "p/ cabelo", 12.45, 0.500);
        produtos.add(prod);

        Carrinho car = new Carrinho();
        car.setId(1);

        ItensCarrinho item = new ItensCarrinho(1, 1, "456789", 12.34, 2);
        itens.add(item);
        item = new ItensCarrinho(2, 1, "55555", 12.45, 3);
        itens.add(item);

        Frete frete = new Frete(1, 20000, 29999, 10.00);
        fretes.add(frete);
        frete = new Frete(2, 10000, 19999, 11.00);
        fretes.add(frete);
    }

    private void incluirProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();
        System.out.println("Digite o UPC do produto:");
        String upc = sc.nextLine();
        System.out.println("Digite o SKU do produto:");
        String sku = sc.nextLine();
        System.out.println("Digite a descrição do produto:");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor do produto:");
        double valor = sc.nextDouble();
        System.out.println("Digite o peso do produto:");
        double peso = sc.nextDouble();

        Produto produto = new Produto(nome, upc, sku, descricao, valor, peso);
        produtos.add(produto);
        System.out.println("Produto incluído com sucesso!");
    }

    private void alterarProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o UPC do produto que deseja alterar:");
        String upc = sc.nextLine();

        for (Produto produto : produtos) {
            if (produto.getUpc().equals(upc)) {
                System.out.println("Produto encontrado: " + produto);
                System.out.println("Digite o novo nome do produto:");
                produto.setNome(sc.nextLine());
                System.out.println("Digite o novo SKU do produto:");
                produto.setSku(sc.nextLine());
                System.out.println("Digite a nova descrição do produto:");
                produto.setDescricao(sc.nextLine());
                System.out.println("Digite o novo valor do produto:");
                produto.setValor(sc.nextDouble());
                System.out.println("Digite o novo peso do produto:");
                produto.setPeso(sc.nextDouble());
                System.out.println("Produto alterado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    private void excluirProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o UPC do produto que deseja excluir:");
        String upc = sc.nextLine();

        Produto produtoParaRemover = null;
        for (Produto produto : produtos) {
            if (produto.getUpc().equals(upc)) {
                produtoParaRemover = produto;
                break;
            }
        }

        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private void buscarProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o UPC do produto que deseja buscar:");
        String upc = sc.nextLine();

        for (Produto produto : produtos) {
            if (produto.getUpc().equals(upc)) {
                System.out.println("Produto encontrado: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    private boolean calcularFrete() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CEP da entrega:");
        int cepEntrega = sc.nextInt();

        double pesoTotal = 0.0;
        for (ItensCarrinho it : itens) {
            for (Produto pr : produtos) {
                if (pr.getUpc().equals(it.getUpc())) {
                    pesoTotal += pr.getPeso() * it.getQtde();
                }
            }
        }

        for (Frete frete : fretes) {
            if (cepEntrega >= frete.getCepInicial() && cepEntrega <= frete.getCepFinal()) {
                double custoFrete = pesoTotal * frete.getValorPorKilo();
                System.out.println("Peso total do carrinho: " + pesoTotal + " kg");
                System.out.println("Custo do frete: " + custoFrete);
                return true;
            }
        }
        System.out.println("CEP não coberto pelo serviço de entrega.");
        return false;
    }
}
