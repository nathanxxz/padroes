# Projeto Template Method

Implementação do padrão de projeto comportamental **Template Method** em Java.

## Estrutura do Projeto

- `src/`
  - `template/`
    - [`GeradorRelatorio.java`](file:///home/fabricionathan/Documentos/template_method/src/template/GeradorRelatorio.java): Classe abstrata que define o método modelo (`gerar()`), os passos comuns (`validarDados()`) e os passos primitivos abstratos (`formatarDados(...)`).
  - `formatos/`
    - [`RelatorioCSV.java`](file:///home/fabricionathan/Documentos/template_method/src/formatos/RelatorioCSV.java): Especialização que formata dados em formato CSV.
    - [`RelatorioHTML.java`](file:///home/fabricionathan/Documentos/template_method/src/formatos/RelatorioHTML.java): Especialização que formata dados em formato HTML.
  - [`Main.java`](file:///home/fabricionathan/Documentos/template_method/src/Main.java): Ponto de entrada para execução dos relatórios.

## Como Executar no VS Code

1. Abra a pasta no VS Code:
   ```bash
   code /home/fabricionathan/Documentos/template_method
   ```
2. Abra o arquivo [`src/Main.java`](file:///home/fabricionathan/Documentos/template_method/src/Main.java) e clique em **Run** ou pressione **`F5`**.
