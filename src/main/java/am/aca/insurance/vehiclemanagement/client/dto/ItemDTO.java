package am.aca.insurance.vehiclemanagement.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemDTO {

    private Long id;

    @JsonProperty(value = "basePrice")
    private Integer price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
