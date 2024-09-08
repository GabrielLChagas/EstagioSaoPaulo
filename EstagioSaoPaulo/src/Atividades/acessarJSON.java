package Atividades;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class acessarJSON {


    public static String getJSON(String strUrl) {
        String textoJson = "";

        try {
            URL url = new URL(strUrl);
            InputStream is = url.openStream();

            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                textoJson += line + "\n";
            }

            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return textoJson;
    }
}
