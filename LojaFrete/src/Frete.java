public class Frete {
    private int id;
    private int cepInicial;
    private int cepFinal;
    private double valorPorKilo;

    public Frete(int id, int cepInicial, int cepFinal, double valorPorKilo) {
        this.id = id;
        this.cepInicial = cepInicial;
        this.cepFinal = cepFinal;
        this.valorPorKilo = valorPorKilo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", CEP Inicial: " + cepInicial + ", CEP Final: " + cepFinal + ", Valor por Kilo: " + valorPorKilo;
    }
}
