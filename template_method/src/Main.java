import formatos.RelatorioCSV;
import formatos.RelatorioHTML;
import template.GeradorRelatorio;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> dados = Arrays.asList(
            "Item 1: R$ 150,00",
            "Item 2: R$ 320,50",
            "Item 3: R$ 89,90"
        );

        System.out.println("=== Gerando Relatório CSV ===");
        GeradorRelatorio relatorioCSV = new RelatorioCSV(dados);
        relatorioCSV.gerar();

        System.out.println("\n=== Gerando Relatório HTML ===");
        GeradorRelatorio relatorioHTML = new RelatorioHTML(dados);
        relatorioHTML.gerar();
    }
}
