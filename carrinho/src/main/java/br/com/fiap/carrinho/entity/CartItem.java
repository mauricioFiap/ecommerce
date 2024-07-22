package br.com.fiap.carrinho.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private int quantity;

    // Assuming product is another entity
    @ManyToOne
    private Product product;

    @ManyToOne
    private ShoppingCart shoppingCart;
}