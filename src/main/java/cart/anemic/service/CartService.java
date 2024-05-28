package cart.anemic.service;

import cart.anemic.model.Cart;
import cart.anemic.model.Item;

public class CartService {
    private Cart cart;

    public Double cartTotal() {
        Double total = 0.0;
        for (Item item: cart.items) {
            total += (item.unitPrice * item.quantity);
        }
        return total;
    }

    public Boolean hasHazardousItems() {
        return cart.items.stream().filter(item -> item.isHazardous).findAny().isPresent();
    }
}
