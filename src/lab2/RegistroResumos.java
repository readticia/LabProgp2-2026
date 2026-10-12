package lab2;
/**
 * Responsável por administrar uma coleção de resumos de estudo, tendo esses uma quantidade limite de armazenamento.
 * * Ao atingir o limite máximo, os novos resumos passam a substituir os mais antigos.
 *
 * @author Letícia Monteiro Gomes 20260011854
 */
public class RegistroResumos {
    private Resumo[] resumos;
    private int quantidade;
    private int posicaoAtual;
    private int limite;

    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.resumos = new Resumo[numeroDeResumos];
        this.quantidade = 0;
        this.posicaoAtual = 0;
    }
    public void adiciona(String tema, String conteudo) {
        this.resumos[this.posicaoAtual] = new Resumo (tema, conteudo);
        if(this.quantidade < this.limite) {
            this.quantidade += 1;
        }
        this.posicaoAtual += 1;
        if(this.posicaoAtual == this.limite) {
            this.posicaoAtual = 0;
        }
    }
    public void adicionaResumo(String tema, String conteudo) {
        this.adiciona(tema, conteudo);
    }
    public int contagem() {
        return this.quantidade;
    }
    public int contaResumos() {
        return this.quantidade;
    }
    public String[] pegaResumos() {
        String[] lista = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            lista[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return lista;
    }
    public boolean temResumo(String tema) {
        for(int i = 0; i < this.quantidade; i++) {
            if(this.resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    public String imprimeResumos() {
        String texto = "- " + this.quantidade + " resumo(s) cadastrado(s)\n- ";
        for(int i = 0; i < this.quantidade; i++) {
            texto += this.resumos[i].getTema();
            if(i < this.quantidade - 1) {
                texto += "| ";
            }
        }
        return texto;
    }
    public String[] busca(String chaveDeBusca) {
        int cont = 0;
        for(int i = 0; i < this.quantidade; i++) {
            String conteudoMin = this.resumos[i].getConteudo().toLowerCase();
            String chaveMin = chaveDeBusca.toLowerCase();
            if(conteudoMin.contains(chaveMin)) {
                cont += 1;
            }
        }
        String[] resultado = new String[cont];
        int indice = 0;
        for(int i = 0; i < this.quantidade; i++) {
            String conteudoMin = this.resumos[i].getConteudo().toLowerCase();
            String chaveMin = chaveDeBusca.toLowerCase();
            if(conteudoMin.contains(chaveMin)) {
                resultado[indice] = this.resumos[i].getTema();
                indice += 1;
            }
        }
        for(int i = 0; i < cont - 1; i++) {
            for(int j = 0; j < cont - 1 - i; j++) {
                if(resultado[j].compareTo(resultado[j + 1]) > 0) {
                    String temp = resultado[j];
                    resultado[j] = resultado [j + 1];
                    resultado [j + 1] = temp;
                }
            }
        }
        return resultado;

    }
}
