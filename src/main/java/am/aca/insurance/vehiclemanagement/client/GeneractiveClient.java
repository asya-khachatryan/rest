package am.aca.insurance.vehiclemanagement.client;

import am.aca.insurance.vehiclemanagement.client.dto.ItemDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GeneractiveClient {
    public static final String BASE_URL = "http://localhost:8087";
    public static final String PATH_ITEM = "/item";

    private final RestTemplate restTemplate;

    public GeneractiveClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String askForHello() {
        return restTemplate.getForEntity(BASE_URL + "/", String.class).getBody();
    }

    public ItemDTO getItem(Long id) {
        return restTemplate
                .getForEntity(BASE_URL + PATH_ITEM + "/" + id, ItemDTO.class)
                .getBody();
    }
}
