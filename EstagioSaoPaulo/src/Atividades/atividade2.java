package Atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade2 {


    Scanner numero = new Scanner(System.in);

    int valEscolhido;

    ArrayList<Integer> fibonacci = new ArrayList<>();

    int val1 = 0;
    int val2 = 1;
    int total = 0;

    public int valorEscolhido() {
        System.out.println("Insira o número escolhico");
        valEscolhido = numero.nextInt();
        return 0;
    }

    public void calcularFiibonacci(){

        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.size() <= 10) {
            total = val1 + val2;
            fibonacci.add(total);
            val1 = val2;
            val2 = total;
        }
        System.out.println(fibonacci);
    }
     public void chequagem(){
         if (fibonacci.contains(valEscolhido)) {
             System.out.println("O valor " + valEscolhido + " é um valor de Fibonacci.");
         } else {System.out.println("O valor " + valEscolhido + " não é um valor de Fibonacci.");}
     }
}
