package conversordemoedas;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ApiExchange {

    private static final String API_KEY = "8d0902c1b2b924b3e4319a7a";

    public double obterTaxa(String base, String destino) {

        String url = "https://v6.exchangerate-api.com/v6/" +
                API_KEY + "/pair/" + base + "/" + destino;

        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonElement elemento = JsonParser.parseString(response.body());
            JsonObject json = elemento.getAsJsonObject();

            return json.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            System.out.println("Erro ao acessar API.");
            return 0;
        }
    }
}