package cart.good.service;

import cart.good.model.Cart;

public class CartService {
    private Cart cart;

    public Double cartTotal() {
        return cart.cartTotal();
    }

    public Boolean hasHazardousItems() {
        return cart.hasHazardousItems();
    }
}
