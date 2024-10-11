import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public static MoedaJson buscaMoeda(String nomeMoeda) {
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/4d700d2ac67064b23dd1d76e/latest/" + nomeMoeda);

//        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(moeda).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MoedaJson.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
