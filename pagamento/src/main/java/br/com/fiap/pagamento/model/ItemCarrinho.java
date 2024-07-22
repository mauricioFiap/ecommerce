package br.com.fiap.pagamento.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemCarrinho {
    private String nome;
    private double preco;
    private int quantidade;

}
