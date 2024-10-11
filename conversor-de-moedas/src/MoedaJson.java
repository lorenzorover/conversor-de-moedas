import java.util.Map;

public record MoedaJson(String result,
                        String base_code,
                        Map<String, Double> conversion_rates) {}
