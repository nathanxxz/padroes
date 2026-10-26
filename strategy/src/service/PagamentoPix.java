package service;

public class PagamentoPix implements ServicoPagamento {
    @Override 
    public void pagar(double valor){
        System.out.println("Pagamento via Pix realizado: R$ " + valor);
    }
}

