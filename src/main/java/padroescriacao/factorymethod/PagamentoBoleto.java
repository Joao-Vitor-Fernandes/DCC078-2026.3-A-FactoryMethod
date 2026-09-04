package padroescriacao.factorymethod;

public class PagamentoBoleto implements IPagamento {

    public String autorizar() {
        return "Boleto gerado com sucesso";
    }

    public String estornar() {
        return "Pagamento via Boleto cancelado";
    }
}
