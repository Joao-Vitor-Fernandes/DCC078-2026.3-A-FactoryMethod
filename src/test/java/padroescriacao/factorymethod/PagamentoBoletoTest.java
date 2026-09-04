package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoBoletoTest {

    @Test
    void deveAutorizarBoleto() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Boleto gerado com sucesso", servico.executar());
    }

    @Test
    void deveEstornarBoleto() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Pagamento via Boleto cancelado", servico.cancelar());
    }
}