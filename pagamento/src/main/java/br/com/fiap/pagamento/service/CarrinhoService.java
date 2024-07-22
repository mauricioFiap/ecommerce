package br.com.fiap.pagamento.service;

import br.com.fiap.pagamento.model.ItemCarrinho;
import br.com.fiap.pagamento.model.ResumoCarrinho;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {
    private List<ItemCarrinho> itensCarrinho;

    public ResumoCarrinho obterResumoCarrinho() {
        ResumoCarrinho resumo = new ResumoCarrinho();
        resumo.setItens(itensCarrinho);
        resumo.setQuantidadeTotal(itensCarrinho.stream().mapToInt(ItemCarrinho::getQuantidade).sum());
        resumo.setValorTotal(itensCarrinho.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum());
        return resumo;
    }

    // Adicionar métodos para manipular itensCarrinho
}
