package lab2;
/**
 * Representa um resumo individual contendo um tema e o seu conteúdo relacionado.
 *
 * @author Letícia Monteiro Gomes 20260011854
 */
public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }
    public String getTema() {
        return this.tema;
    }
    public String getConteudo() {
        return this.conteudo;
    }
}
