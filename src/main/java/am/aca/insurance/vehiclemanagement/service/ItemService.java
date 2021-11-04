package am.aca.insurance.vehiclemanagement.service;

import am.aca.insurance.vehiclemanagement.client.GeneractiveClient;
import am.aca.insurance.vehiclemanagement.client.dto.ItemDTO;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final GeneractiveClient generactiveClient;

    public ItemService(GeneractiveClient generactiveClient) {
        this.generactiveClient = generactiveClient;
    }

    public ItemDTO getItem(Long id) {
        return generactiveClient.getItem(id);
    }
}
