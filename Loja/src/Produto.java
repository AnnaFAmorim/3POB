public class Produto {
    private String nome;
    private String upc;
    private String sku;
    private String descricao;
    private double valor;
    private double peso;

    public Produto() {
        // Construtor vazio
    }

    public Produto(String nome, String upc, String sku, String descricao, double valor, double peso) {
        this.nome = nome;
        this.upc = upc;
        this.sku = sku;
        this.descricao = descricao;
        this.valor = valor;
        this.peso = peso;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", upc='" + upc + '\'' +
                ", sku='" + sku + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", peso=" + peso +
                '}';
    }
}
