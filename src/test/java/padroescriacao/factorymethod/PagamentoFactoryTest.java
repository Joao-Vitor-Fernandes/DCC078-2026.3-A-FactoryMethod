package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        try {
            IPagamento pagamento = PagamentoFactory.obterPagamento("DinheiroFisico");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {
        try {
            IPagamento pagamento = PagamentoFactory.obterPagamento("CarteiraDigital");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inválido", e.getMessage());
        }
    }
}
