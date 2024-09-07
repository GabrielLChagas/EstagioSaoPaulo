package Atividades;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class atividade3 extends acessarJSON {

    String dados = getJSON(
            "https://raw.githubusercontent.com/GabrielLChagas/EstagioSaoPaulo/main/dadosDeDaturamento");

    try {
        JSONParser dados = new JSONParser();
        Object  objeto = dados.parse(dados);
        JSONObject objetoJson = (JSONObject) objeto;

        JSONObject listaDados = (JSONObject) objetoJson.get();
    }
    catch(Exception ex) {
        ex.printStackTrace();
    }

    public void inprimir(){
        System.out.println(dados);
    }
}
