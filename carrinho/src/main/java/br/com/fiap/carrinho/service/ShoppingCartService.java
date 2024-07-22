package br.com.fiap.carrinho.service;

import br.com.fiap.carrinho.dto.CartItemDto;
import br.com.fiap.carrinho.entity.CartItem;
import br.com.fiap.carrinho.entity.ShoppingCart;
import br.com.fiap.carrinho.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    private final CartItemRepository cartItemRepository;

    @Autowired
    public ShoppingCartService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public void addItemToCart(CartItemDto cartItemDto) {
        // Logic to add item to cart
    }

    public void removeItemFromCart(CartItemDto cartItemDto, ShoppingCart shoppingCart) {
        // Logic to remove item from cart
    }

    public List<CartItemDto> getCartItems() {
        // Logic to get cart items
        return null;
    }

    public void addItemToCart(CartItemDto cartItemDto, ShoppingCart shoppingCart) {
        // Logic to add item to cart

        CartItem cartItem = new CartItem();
        cartItem.setShoppingCart(shoppingCart);
        cartItem.setQuantity(cartItemDto.getQuantity());
        cartItemRepository.save(cartItem);

    }
}