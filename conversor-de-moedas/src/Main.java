import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // API Key: 4d700d2ac67064b23dd1d76e
        // Example Request: https://v6.exchangerate-api.com/v6/4d700d2ac67064b23dd1d76e/latest/USD

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                
                Seja bem vindo ao conversor de moedas!
                
                Digite a moeda que você quer converter e seu valor (apenas a sigla, ex.: BRL, USD, EUR).
                Nome:""");
        String moedaEscolhida = scanner.next();

        // Converte a moeda escolhida
        MoedaJson moedaJson = ConsultaMoeda.buscaMoeda(moedaEscolhida);
        Map<String, Double> taxas = moedaJson.conversion_rates();

        System.out.println("Valor:");
        double valor = scanner.nextDouble();

        // Pega o número de moedas que quer retornar
        System.out.println("""
                
                Digite quantos tipos de moeda você quer que retorne:
                (Nota!!! Caso queira uma pequena lista fixa, digite "n")""");
        String numMoedas = scanner.next();

        List<Moeda> moedas = new ArrayList<>();

        System.out.println(); // Pula linha
        Moeda moeda = new Moeda();

        if (numMoedas.equals("n")) {
            moeda = new Moeda("USD", taxas.get("USD"));
            moedas.add(moeda);
            moeda = new Moeda("AED", taxas.get("AED"));
            moedas.add(moeda);
            moeda = new Moeda("AFN", taxas.get("AFN"));
            moedas.add(moeda);
            moeda = new Moeda("ALL", taxas.get("ALL"));
            moedas.add(moeda);
            moeda = new Moeda("AMD", taxas.get("AMD"));
            moedas.add(moeda);
            moeda = new Moeda("ANG", taxas.get("ANG"));
            moedas.add(moeda);

        } else {
            int numMoedasNovo = Integer.parseInt(numMoedas);
            for (int i = 0; i < numMoedasNovo; i++) {
                System.out.println("Digite a " + (i + 1) + "ª moeda:");
                String nomeMoeda = scanner.next();

                moeda = new Moeda(nomeMoeda.toUpperCase(), taxas.get(nomeMoeda.toUpperCase()));
                moedas.add(moeda);
            }
        }

        CalculaConversao.calcular(valor, moedas);

        System.out.println("""
                
                
                Conversão realizada!
                Moeda escolhida:""");
        System.out.println("Moeda:" + moedaEscolhida.toUpperCase() + " | Valor: " + valor);

        System.out.println("\nConversão:");
        for (Moeda moeda1 : moedas) {
            System.out.println("Moeda: " + moeda1.getNome() + " | Valor: " + moeda1.getValor());
        }

    }

}