package formatos;

import java.util.List;
import template.GeradorRelatorio;

public class RelatorioHTML extends GeradorRelatorio {

    public RelatorioHTML(List<String> dados) {
        super(dados);
    }

    @Override
    protected String formatarDados(List<String> dados) {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n<html>\n<head><title>Relatório</title></head>\n<body>\n");
        sb.append("  <h1>Relatório</h1>\n  <ul>\n");
        for (String dado : dados) {
            sb.append("    <li>").append(dado).append("</li>\n");
        }
        sb.append("  </ul>\n</body>\n</html>");
        return sb.toString();
    }
}
