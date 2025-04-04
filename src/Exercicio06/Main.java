package Exercicio06;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(10, 50, 30);
        Hora h2 = new Hora(5, 8, 7);
        Hora h3 = new Hora(37, 400, 3000);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());
        System.out.println(h3.formatar());



    }


}
