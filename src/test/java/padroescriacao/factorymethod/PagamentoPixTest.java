package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoPixTest {

    @Test
    void deveAutorizarPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via Pix autorizado", pagamento.autorizar());
    }

    @Test
    void deveEstornarPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via Pix estornado", pagamento.estornar());
    }
}
