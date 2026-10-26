import controller.Checkout;
import service.PagamentoCartao;
import service.PagamentoPix;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Teste do Padrão Strategy ===");

        // Inicia o checkout com a estratégia Pix
        Checkout checkout = new Checkout(new PagamentoPix());
        System.out.println("\n1. Executando pagamento inicial com Pix:");
        checkout.finalizarCompra(150.00);

        // Altera dinamicamente o comportamento em tempo de execução para Cartão
        System.out.println("\n2. Trocando estratégia para Cartão:");
        checkout.setMetodoPagamento(new PagamentoCartao());
        checkout.finalizarCompra(320.50);

        System.out.println("\nExecução finalizada com sucesso!");
    }
}
