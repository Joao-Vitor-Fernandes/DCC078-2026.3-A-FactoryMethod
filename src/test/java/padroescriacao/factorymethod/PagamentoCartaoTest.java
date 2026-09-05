package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoCartaoTest {

    @Test
    void deveAutorizarCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento via Cartão autorizado", pagamento.autorizar());
    }

    @Test
    void deveEstornarCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento via Cartão estornado", pagamento.estornar());
    }
}
