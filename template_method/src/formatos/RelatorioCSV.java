package formatos;

import java.util.List;
import template.GeradorRelatorio;

public class RelatorioCSV extends GeradorRelatorio {

    public RelatorioCSV(List<String> dados) {
        super(dados);
    }

    @Override
    protected String formatarDados(List<String> dados) {
        StringBuilder sb = new StringBuilder();
        sb.append("--- RELATÓRIO CSV ---\n");
        sb.append(String.join("; ", dados));
        return sb.toString();
    }
}
