package com.aluracurosos.conversor;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

    public class Conversor {

       public Conversor() {

        }

         public double conversion (String baseCode, String targetCode, Double amount) throws IOException, InterruptedException {
            String key = "https://v6.exchangerate-api.com/v6/f3c268f5bc1d329c67aa43c9/pair/" +
                    baseCode + "/" + targetCode + "/" + amount;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(key)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(json);
            return jsonNode.get("conversion_result").asDouble();
        }
}
