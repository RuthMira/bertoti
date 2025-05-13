public class SistemaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado.");
    }
}

public class SistemaEstoque {
    public void atualizarEstoque(String produto) {
        System.out.println("Estoque atualizado para o produto: " + produto);
    }
}

public class SistemaNotaFiscal {
    public void emitirNota(String produto, double valor) {
        System.out.println("Nota fiscal emitida para: " + produto + ", valor: R$" + valor);
    }
}


public class LojaFacade {
    private SistemaPagamento pagamento;
    private SistemaEstoque estoque;
    private SistemaNotaFiscal notaFiscal;

    public LojaFacade() {
        this.pagamento = new SistemaPagamento();
        this.estoque = new SistemaEstoque();
        this.notaFiscal = new SistemaNotaFiscal();
    }

    public void venderProduto(String produto, double valor) {
        pagamento.processarPagamento(valor);
        estoque.atualizarEstoque(produto);
        notaFiscal.emitirNota(produto, valor);
    }
}


public class FacatePattern {
    public static void main(String[] args) {
        LojaFacade fachada = new LojaFacade();
        fachada.venderProduto("Notebook", 2500.0);
    }
}

