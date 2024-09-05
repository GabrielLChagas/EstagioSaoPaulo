package Atividades;

import java.util.*;
public class atividade4 {

    Map<String, Double> faturaMensal = new LinkedHashMap<>(){{
        put("SP", 67836.43d);
        put("RJ", 36678.66d);
        put("MG", 29229.88d);
        put("ES", 27165.48d);
        put("Outros", 19849.53d);
    }};

    Iterator<Double> faturaTotal = faturaMensal.values().iterator();

    Map<String, Double> faturaPocentual = new HashMap<>();

    Iterator<String> estados = faturaMensal.keySet().iterator();

    Iterator<Double> valoresOriginais = faturaMensal.values().iterator();

    public Double calcularTotal() {
        Double total = 0d;
        while(faturaTotal.hasNext()) {
            total += faturaTotal.next();
        }
        return total;
    }

    Double total = calcularTotal().doubleValue();

    public void calcularPocentagem(){
        Double pocentagem = 0d;
        while (valoresOriginais.hasNext()){
            pocentagem = valoresOriginais.next()/total;
            faturaPocentual.put(estados.next(), pocentagem);
        }
    }

    public void teste(){
        System.out.println(faturaPocentual);
    }

}

