package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }
    public void adicionaTempoOnline(int tempo){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }
    public void adicionaTempoOnline(int tempo){
        this.tempoInvestidoOnline += tempo;
    }
   public boolean atingiuMetaTempoOnline() {return tempoInvestidoOnline >= tempoEsperado;}

    public String toString(){
        return nomeDisciplina + " " + Integer.toString(tempoInvestidoOnline) + "/" + Integer.toString(tempoEsperado);
    }
}
