package br.com.fiap.pagamento.controller;

import br.com.fiap.pagamento.model.DadosPagamento;
import br.com.fiap.pagamento.model.RespostaPagamento;
import br.com.fiap.pagamento.model.ResumoCarrinho;
import br.com.fiap.pagamento.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @GetMapping("/resumo")
    public ResumoCarrinho obterResumo() {
        return carrinhoService.obterResumoCarrinho();
    }

    @PostMapping("/simularPagamento")
    public RespostaPagamento simularPagamento(@RequestBody DadosPagamento dadosPagamento) {
        // Simulação de chamada ao endpoint mockado
        return new RespostaPagamento("Pagamento realizado com sucesso");
    }
}