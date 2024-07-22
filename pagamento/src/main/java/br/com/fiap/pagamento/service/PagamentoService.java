package br.com.fiap.pagamento.service;

import br.com.fiap.pagamento.model.DadosPagamento;
import br.com.fiap.pagamento.model.RespostaPagamento;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PagamentoService {

    private final WebClient webClient;

    public PagamentoService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://mocked-payment-api.com").build();
    }

    public RespostaPagamento simularPagamento(DadosPagamento dadosPagamento) {
        return this.webClient.post()
                .uri("/simular")
                .bodyValue(dadosPagamento)
                .retrieve()
                .bodyToMono(RespostaPagamento.class)
                .block(); // Use block somente em aplicações que suportam bloqueio
    }
}
