package br.com.fiap.pagamento.model;

public class RespostaPagamento {

    private String status;
    private String mensagem;
    private boolean pagamentoAprovado;

    public RespostaPagamento(String pagamentoRealizadoComSucesso) {
        this.mensagem = pagamentoRealizadoComSucesso;
    }
}
