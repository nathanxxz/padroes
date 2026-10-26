package template;

import java.util.List;

public abstract class GeradorRelatorio {

    private final List<String> dados;

    public GeradorRelatorio(List<String> dados) {
        this.dados = dados;
    }

    public final void gerar() {
        validarDados();
        String conteudo = formatarDados(dados);
        apresentarRelatorio(conteudo);
    }

    private void validarDados() {
        if (dados == null || dados.isEmpty()) {
            throw new IllegalArgumentException(
                "O relatório não possui dados."
            );
        }
    }

    protected abstract String formatarDados(List<String> dados);

    protected void apresentarRelatorio(String conteudo) {
        System.out.println(conteudo);
    }
}
