import java.util.Scanner;

import controller.Checkout;
import service.PagamentoCartao;
import service.PagamentoPix;
import service.ServicoPagamento;

public class Main {

    /*
    * Conceito: Nós precisamos dizer ou passar a informação
    * do comportamento que nós queremos que o software tenha
    *
    * Maior vantagem: Não precisar mudar regras em controllers
    * que já implementam a interface de ServicoPagamento
    * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Checkout checkout = new Checkout(new PagamentoPix());
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE PAGAMENTO ===");
            System.out.println("1 - Pagar com Pix");
            System.out.println("2 - Pagar com Cartão");
            System.out.println("0 - Sair");
            System.out.print("Escolha o tipo de pagamento: ");

            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            ServicoPagamento metodoPagamento;

            switch (opcao) {
                case 1:
                    metodoPagamento = new PagamentoPix();
                    break;

                case 2:
                    metodoPagamento = new PagamentoCartao();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.print("Informe o valor do pagamento: R$ ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                System.out.println("O valor deve ser maior que zero!");
                continue;
            }

            checkout.setMetodoPagamento(metodoPagamento);
            checkout.finalizarCompra(valor);

        } while (true);

        scanner.close();
    }
}