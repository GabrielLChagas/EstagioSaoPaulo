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

    Set<String> estados = faturaMensal.keySet();

    Iterator<Double> valoresOriginais = faturaMensal.values().iterator();

    public Double calcularTotal() {
        Double total = 0d;
        while(faturaTotal.hasNext()) {
            total += faturaTotal.next();
        }
        return total;
    }

    public void calcularPocentagem(){
        Double pocentagem = 0d;
        while (valoresOriginais.hasNext()){
            pocentagem = valoresOriginais.next()/calcularTotal();
            faturaPocentual.put(estados.iterator().next(), pocentagem);
        }
    }

    public void teste(){
        System.out.println(faturaPocentual);
    }

}

