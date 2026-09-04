package padroescriacao.factorymethod;

public class PagamentoCarteiraDigital implements IPagamento {

    public String autorizar() {
        return "Pagamento via Carteira Digital autorizado";
    }

    public String estornar() {
        return "Valor devolvido para a Carteira Digital do cliente";
    }
}
