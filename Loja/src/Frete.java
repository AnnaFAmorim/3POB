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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCepInicial() {
        return cepInicial;
    }

    public void setCepInicial(int cepInicial) {
        this.cepInicial = cepInicial;
    }

    public int getCepFinal() {
        return cepFinal;
    }

    public void setCepFinal(int cepFinal) {
        this.cepFinal = cepFinal;
    }

    public double getValorPorKilo() {
        return valorPorKilo;
    }

    public void setValorPorKilo(double valorPorKilo) {
        this.valorPorKilo = valorPorKilo;
    }
}
