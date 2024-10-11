import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class CalculaConversao {

    public static void calcular(double valor, List<Moeda> moedas) {
        for (Moeda moeda : moedas) {
            double novoValor = moeda.getValor() * valor; // Cálculo da conversão

            // Arredonda os valores
            BigDecimal bd = new BigDecimal(novoValor);
            bd = bd.setScale(2, RoundingMode.HALF_UP);

            // Atualiza os valores
            moeda.setValor(bd.doubleValue());
        }
    }
}
