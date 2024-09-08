package Atividades;

import com.google.gson.Gson;

import java.util.*;

public class atividade3 extends acessarJSON {

    String arquivo = getJSON(
            "https://raw.githubusercontent.com/GabrielLChagas/EstagioSaoPaulo/main/dadosDeDaturamento");

    Map<String, Double> map = new Gson().fromJson(arquivo.toString(), Map.class);

    Iterator<Double> diasUteis = map.values().iterator();
    Double media = 0d;
    Integer dias = 0;
    Double totalMes = 0d;

    public void imprimirValores(){
        while (diasUteis.hasNext()){
            if (diasUteis.next() != 0){
                totalMes += diasUteis.next();
                dias++;
            }
        }

        media = totalMes/dias;

        System.out.println("\nMaior faturamento do mês: " + Collections.max(map.values()));
        System.out.println("\nMenor faturamento do mês: " + Collections.min(map.values()));
        System.out.println("\nMédia mensal: " + media);
    }

}
