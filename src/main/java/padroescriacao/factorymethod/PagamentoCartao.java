package padroescriacao.factorymethod;

public class PagamentoCartao implements IPagamento {

    public String autorizar() {
        return "Pagamento via Cartão autorizado";
    }

    public String estornar() {
        return "Pagamento via Cartão estornado";
    }
}
