package lab2;
/**
 * Responsável por companhar a rotina de descanso do aluno.
 * Para o aluno ser considerado descansado, ele precisa acumular, no mínimo, 26 horas de descanso por semana.
 *
 * @author Letícia Monteiro Gomes 20260011854
 */
public class Descanso{
    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(int horas){
        this.horasDescanso = horas;
    }
    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }
    public String getStatusGeral() {
        if(this.numeroSemanas > 0 && (this.horasDescanso / this.numeroSemanas) >= 26){
            return "descansado";
        }
        return "cansado";
    }
}
