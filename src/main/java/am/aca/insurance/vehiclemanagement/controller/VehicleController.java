package am.aca.insurance.vehiclemanagement.controller;

import am.aca.insurance.vehiclemanagement.client.HelloClient;
import am.aca.insurance.vehiclemanagement.client.dto.ItemDTO;
import am.aca.insurance.vehiclemanagement.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    private final HelloClient helloClient;
    private final ItemService itemService;

    public VehicleController(HelloClient helloClient, ItemService itemService) {
        this.helloClient = helloClient;
        this.itemService = itemService;
    }

    @GetMapping
    public ItemDTO getVehicle() {
        return itemService.getItem(1L);
    }
}
