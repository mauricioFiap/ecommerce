package br.com.fiap.pagamento.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DadosPagamento {
    private List<ItemCarrinho> itens;
    private double custoTotal;
    private String tipoPagamento;

}