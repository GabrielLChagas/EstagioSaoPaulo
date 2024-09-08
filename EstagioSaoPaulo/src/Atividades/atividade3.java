package Atividades;

import com.google.gson.Gson;

import java.util.*;

public class atividade3 extends acessarJSON {

    String arquivo = getJSON("https://raw.githubusercontent.com/GabrielLChagas/EstagioSaoPaulo/main/dadosDeDaturamento");

    Map<String, Double> jsonMap = new Gson().fromJson(arquivo, Map.class);

    Iterator<Double> diasUteis = jsonMap.values().iterator();

    Map<String, Double> resultadosAcimaDaMedia = new LinkedHashMap<>(jsonMap);

    Iterator<Double> valores = resultadosAcimaDaMedia.values().iterator();

    Double media = 0d;
    Integer dias = 0;
    Double totalMes = 0d;

    public void imprimirValores() {

        while (diasUteis.hasNext()) {
            if (diasUteis.next() >= 0d) {
                totalMes += diasUteis.next();
                dias++;
            }
            media = totalMes / dias;
        }
        while (valores.hasNext()) {
            if (valores.next() <= media)
                valores.remove();
        }



        System.out.println("\nMaior faturamento do mês: " + Collections.max(jsonMap.values()));
        System.out.println("Menor faturamento do mês: " + Collections.min(jsonMap.values()));
        System.out.println("Média mensal: " + media);
        System.out.println("Dias da ganhos superior a média: " + resultadosAcimaDaMedia.toString());
    }
}
