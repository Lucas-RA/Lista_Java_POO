package Exercicio07;

public class Bola {
//    deixaríamos privado se tivesse um get ou set
    private String cor;
    private Double raio;

    public Bola(String cor, Double raio) {
        this.cor = cor;
        this.raio = raio;
    }

//    bola 1 está chamando o método - para acessar seus dados: this.

//    endereço de memória das bolas no (_)
    public Bola maiorBola(Bola a, Bola b){
//        variável que vai receber o endereço da maior Bola
        Bola aux = null;
//      se o raio da bola 1 é maior
        if (this.raio > a.raio && this.raio > b.raio){
//            pegar o endereço de memória da bola 1 (que chamou o método) -> this faz referência ao endereço de memória que está sendo criado
            aux = this;
        }
        else if(a.raio > b.raio){
            aux = a;
        }
        else{
            aux = b;
        }
        return aux;
    }

    public String retornarDados(){
        return cor + " " + raio;
    }
}
