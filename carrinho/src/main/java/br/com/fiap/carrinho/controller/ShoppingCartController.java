package br.com.fiap.carrinho.controller;

import br.com.fiap.carrinho.dto.CartItemDto;
import br.com.fiap.carrinho.entity.ShoppingCart;
import br.com.fiap.carrinho.service.ShoppingCartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;


    @PostMapping("/add")
    public ResponseEntity<?> addItemToCart(@RequestBody CartItemDto cartItemDto, @SessionAttribute("shoppingCart") ShoppingCart shoppingCart) {
        shoppingCartService.addItemToCart(cartItemDto, shoppingCart);
        return ResponseEntity.ok().build();
    }

    // Construtor com injeção de dependência
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }


    @PostMapping("/remove")
    public ResponseEntity<?> removeItemFromCart(@RequestBody CartItemDto cartItemDto, @SessionAttribute("shoppingCart") ShoppingCart shoppingCart) {
        shoppingCartService.removeItemFromCart(cartItemDto, shoppingCart);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/view")
    public ResponseEntity<List<CartItemDto>> viewCart() {
        List<CartItemDto> cartItems = shoppingCartService.getCartItems();
        return ResponseEntity.ok(cartItems);
    }
}