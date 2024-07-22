package br.com.fiap.pagamento.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResumoCarrinho {
    private List<ItemCarrinho> itens;
    private int quantidadeTotal;
    private double valorTotal;

    // Getters e Setters
}