import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConversorClient {
    public Coin transCoin(String base_code, String target_code, double amount){

        URI address = URI.create("https://v6.exchangerate-api.com/v6/5eb4b63bc149c970eb0ede75/pair/"+base_code+"/"+ target_code + "/" +amount);
        
          HttpClient client = HttpClient.newHttpClient();
          HttpRequest request = HttpRequest.newBuilder()
                    .uri(address)
                    .build();
        

         try {
            HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                        return new Gson().fromJson(response.body(), Coin.class);
                
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Opcion inválida.");
        }      

    }
}
