public class Moeda {
    private String nome;
    private double valor;

    // Ao contrário da classe MoedaJson, essa não pode ser um record pelo fato de eu estar
    // calculando os valores e precisando utilizar Setters na classe CalculaConversao
    public Moeda() {
    }

    public Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
