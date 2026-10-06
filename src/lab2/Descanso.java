package lab2;

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
