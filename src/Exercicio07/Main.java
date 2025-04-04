package Exercicio07;

public class Main {
    public static void main(String[] args) {
//        podemos saber que temos 2 atributos - pois aqui temos o construtor que inicializa o atributo os valores passados no caso 2 pelo menos
        Bola bola1 = new Bola("azul", 2.75);
        Bola bola2 = new Bola("branca", 3.5);
        Bola bola3 = new Bola("vermelha", 3.25);

//        aqui ocorre uma chamada de método - passamos 2 parâmetros do tipo bola (objeto) - retorna um objeto do tipo bola
//        entre as 3 bolas, pois a bola 1 chama o método para comparar entre as outras 2 bolas
//    sabemos que o método está dentro da classe bola pois precisou ser puxado pelo objeto
        Bola aux = bola1.maiorBola(bola2, bola3);
//      chamada do método retornar dados
        System.out.println("Dados da bola com o maior raio -> "+ aux.retornarDados());
    }
}
