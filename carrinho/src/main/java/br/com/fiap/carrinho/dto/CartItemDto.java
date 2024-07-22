package br.com.fiap.carrinho.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemDto {
    private Long id;
    private String itemName;
    private int quantity;

}