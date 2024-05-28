package cart.good.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {
    private String productCode;
    private Integer quantity;
    private Double unitPrice;
    private Boolean isHazardous;

    public Double price() {
        return unitPrice * quantity;
    }

    public Boolean getIsHazardous() {
        return isHazardous;
    }
}
