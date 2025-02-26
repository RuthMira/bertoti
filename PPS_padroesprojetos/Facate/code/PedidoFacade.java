package PPS_padroesprojetos.Facate.code;

public class PedidoFacade {
    private Cozinha cozinha;
    private Bar bar;
    private Pagamento pagamento;

    public PedidoFacade() {
        this.cozinha = new Cozinha();
        this.bar = new Bar();
        this.pagamento = new Pagamento();
    }

    public void fazerPedido() {
        cozinha.prepararComida();
        bar.prepararBebida();
        pagamento.efetuarPagamento();
    }
}
