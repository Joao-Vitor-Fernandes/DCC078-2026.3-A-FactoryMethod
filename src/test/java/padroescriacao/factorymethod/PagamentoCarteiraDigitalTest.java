package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoCarteiraDigitalTest {

    @Test
    void deveAutorizarCarteiraDigital() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("CarteiraDigital");
        assertEquals("Pagamento via Carteira Digital autorizado", pagamento.autorizar());
    }

    @Test
    void deveEstornarCarteiraDigital() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("CarteiraDigital");
        assertEquals("Valor devolvido para a Carteira Digital do cliente", pagamento.estornar());
    }
}
