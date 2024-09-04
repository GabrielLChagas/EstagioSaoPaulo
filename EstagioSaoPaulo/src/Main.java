import Atividades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  1-------------
        int indice = 13;
        int soma = 0;

        for (int k = 0; k < indice; k++, soma+=k) System.out.println(soma);

//  2-------------

        atividade2 chamaga2 = new atividade2();

        chamaga2.valorEscolhido();

        chamaga2.calcularFiibonacci();

        chamaga2.chequagem();

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
//        4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//• SP – R$67.836,43
//• RJ – R$36.678,66
//• MG – R$29.229,88
//• ES – R$27.165,48
//• Outros – R$19.849,53
//
//  Escreva um programa na linguagem que desejar onde calcule o percentual de representação
//  que cada estado teve dentro do valor total mensal da distribuidora.  
//
//  5-------------

        Scanner inFrase = new Scanner(System.in);
        System.out.println("Insira uma frase: ");
        String frase = inFrase.nextLine();
        StringBuilder inversor = new StringBuilder(frase);
        System.out.println(inversor.reverse());
    }
}