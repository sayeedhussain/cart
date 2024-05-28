package cart.good.model;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class Cart {
    private List<Item> items;

    public Double cartTotal() {
        Double total = 0.0;
        for (Item item: items) {
            total += item.price();
        }
        return total;
    }

    public Boolean hasHazardousItems() {
        Optional<Item> hazardousItem = items.stream().filter(item -> item.getIsHazardous()).findAny();
        return hazardousItem.isPresent();
    }
}