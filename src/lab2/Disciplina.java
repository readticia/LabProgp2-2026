package lab2;
/**
 * Responsável por acompanhar o desempenho acadêmico do aluno em uma disciplina, permitindo registrar horas de estudo do aluno.
 *  Cadastra as notas do aluno e calcula a média dessas notas(simples ou ponderada).
 *
 *  @author Letícia Monteiro Gomes 20260011854
 */

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;
    private int numNotas;
    private boolean temPesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.numNotas = 4;
        this.notas = new double[4];
        this.temPesos = false;
    }
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.numNotas = numNotas;
        this.notas = new double[numNotas];
        this.temPesos = false;
    }
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.numNotas = numNotas;
        this.notas = new double[numNotas];
        this.pesos = pesos;
        this.temPesos = true;
    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }
    private double calculaMedia() {
        if(this.temPesos == false) {
            double soma = 0.0;
            for(int i = 0; i < this.numNotas; i++) {
                soma += this.notas[i];
            }
            return soma / this.numNotas;
        }
        double somaNotasEPesos = 0.0;
        int somaPesos = 0;
        for(int i = 0; i < this.numNotas; i++) {
            somaNotasEPesos = somaNotasEPesos + (this.notas[i] * this.pesos[i]);
            somaPesos += this.pesos[i];
        }
        return somaNotasEPesos / somaPesos;
    }
    public boolean aprovado() {
        if(calculaMedia() >= 7.0) {
            return true;
        }
        return false;
    }
    public String toString() {
        String textoNotas = "[";
        for(int i = 0; i < this.numNotas; i++) {
            textoNotas += this.notas[i];
            if (i < this.numNotas - 1) {
                textoNotas = textoNotas + ", ";
            }
        }
        textoNotas += "]";
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + textoNotas;
    }
}
