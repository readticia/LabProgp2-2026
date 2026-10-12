package lab2;
/**
 * Responsável por controlar a quantidade de tempo de internet (horas online) dedicada a alguma disciplina.
 * Avalia se o aluno atingiu o tempo de dedicação esperado para aquela disciplina.
 *
 * @author Letícia Monteiro Gomes 20260011854
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineGasto;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineGasto = 0;
    }
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
        this.tempoOnlineGasto = 0;
    }
    public void adicionaTempoOnline(int tempo){
        this.tempoOnlineGasto += tempo;
    }
   public boolean atingiuMetaTempoOnline() {
       if (this.tempoOnlineGasto >= this.tempoOnlineEsperado) {
           return true;
       }
       return false;
   }

    public String toString(){
        return this.nomeDisciplina + " " + this.tempoOnlineGasto + "/" + this.tempoOnlineEsperado;
    }
}
