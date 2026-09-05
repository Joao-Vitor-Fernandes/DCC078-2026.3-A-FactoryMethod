package padroescriacao.factorymethod;

public class PagamentoCarteiraDigital {

    public String autorizar() {
        return "Pagamento via Carteira Digital autorizado";
    }

    public String estornar() {
        return "Valor devolvido para a Carteira Digital do cliente";
    }
}
