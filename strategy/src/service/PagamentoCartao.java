package service;

public class PagamentoCartao implements ServicoPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Cartão realizado: R$ " + valor);
    }
    
}

