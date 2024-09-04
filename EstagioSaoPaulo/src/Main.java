import Atividades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  1-------------
        int indice = 13;
        int soma = 0;

        for (int k = 0; k < indice; k++, soma+=k) System.out.println(soma);

//  2-------------

        atividade2 chamada2 = new atividade2();

        chamada2.valorEscolhido();

        chamada2.calcularFiibonacci();

        chamada2.chequagem();

//  3-------------
// 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
// faça um programa, na linguagem que desejar, que calcule e retorne:
//• O menor valor de faturamento ocorrido em um dia do mês;
//• O maior valor de faturamento ocorrido em um dia do mês;
//• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
//
//  IMPORTANTE:
// a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
//b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
// Estes dias devem ser ignorados no cálculo da média;



//  4-------------
        atividade4 chamada4 = new atividade4();

        chamada4.calcularTotal();
        chamada4.calcularPocentagem();
        chamada4.teste();


//  5-------------

        Scanner inFrase = new Scanner(System.in);
        System.out.println("Insira uma frase: ");
        String frase = inFrase.nextLine();
        StringBuilder inversor = new StringBuilder(frase);
        System.out.println(inversor.reverse());
    }
}