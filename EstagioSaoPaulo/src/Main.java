import Atividades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////  1-------------
        int indice = 13;
        int soma = 0;

        for (int k = 0; k < indice; k++, soma+=k) System.out.println(soma);

////  2-------------

        atividade2 chamada2 = new atividade2();

        chamada2.valorEscolhido();

        chamada2.calcularFiibonacci();

        chamada2.chequagem();

//  3-------------
        atividade3 chamada3 = new atividade3();

        chamada3.imprimirValores();


//  4-------------
        atividade4 chamada4 = new atividade4();

        chamada4.calcularTotal();
        chamada4.calcularPocentagem();
        chamada4.teste();


////  5-------------

        Scanner inFrase = new Scanner(System.in);
        System.out.println("Insira uma frase: ");
        String frase = inFrase.nextLine();
        StringBuilder inversor = new StringBuilder(frase);
        System.out.println(inversor.reverse());
    }
}