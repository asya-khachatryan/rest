package am.aca.insurance.vehiclemanagement.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloClient {

    public static final String BASE_URL = "http://localhost:8087";

    private final RestTemplate restTemplate;

    public HelloClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String askForHello() {
        return restTemplate.getForEntity(BASE_URL + "/", String.class).getBody();
    }
}
