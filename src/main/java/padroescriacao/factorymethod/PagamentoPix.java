package padroescriacao.factorymethod;

public class PagamentoPix implements IPagamento {
    public String autorizar() {
        return "Pagamento via Pix autorizado";
    }

    public String estornar() {
        return "Pagamento via Pix estornado";
    }
}
