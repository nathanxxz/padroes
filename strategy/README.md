# Projeto Strategy

Projeto Java demonstrando o padrão de projeto **Strategy** no Visual Studio Code.

## Estrutura

- `src/`
  - `controller/Checkout.java`: Contexto que utiliza a estratégia de pagamento
  - `service/ServicoPagamento.java`: Interface da estratégia
  - `service/PagamentoPix.java`: Estratégia concreta para Pix
  - `service/PagamentoCartao.java`: Estratégia concreta para Cartão
  - `Main.java`: Ponto de entrada interativo (menu via terminal)
  - `App.java`: Ponto de entrada direto para testes rápidos
- `bin/`: Bytecodes compilados

## Como executar

1. Abra o projeto no VS Code:
   ```bash
   code /home/fabricionathan/Documentos/strategy
   ```
2. Abra [`src/Main.java`](file:///home/fabricionathan/Documentos/strategy/src/Main.java) (menu interativo com scanner) ou [`src/App.java`](file:///home/fabricionathan/Documentos/strategy/src/App.java) (teste direto automatizado) e clique em **Run** ou aperte **`F5`**.
