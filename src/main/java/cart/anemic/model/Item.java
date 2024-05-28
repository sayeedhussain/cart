package cart.anemic.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item {
    public String productCode;
    public Integer quantity;
    public Double unitPrice;
    public Boolean isHazardous;
}
