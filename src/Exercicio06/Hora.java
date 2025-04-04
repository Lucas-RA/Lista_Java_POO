package Exercicio06;


public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = verificaHoras(horas);
        this.minutos = verificaMinutos(minutos);
        this.segundos = verificaSegundos(segundos);
    }

    private int verificaHoras(int horas){
       return(horas>= 0 && horas <= 23 ? horas : 0);
    }

    private int verificaMinutos(int minutos){
      return(minutos>= 0 && minutos <= 59 ? minutos : 0);
    }

    private int verificaSegundos(int segundos) {
        return verificaMinutos(segundos);
    }

    public String formatar(){
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }




}
