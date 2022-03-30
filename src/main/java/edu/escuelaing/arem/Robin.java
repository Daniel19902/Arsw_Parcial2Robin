package edu.escuelaing.arem;

import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Robin {


    private String puertoSin = "4568";
    private String puertoSqrt = "4568";
    private Gson gson = new Gson();
    private String puerto = "";


    public String calcular(String servicio, String numero) throws MalformedURLException {

        if(servicio.equals("")){
            puerto = puertoSin;
        }else if(puerto.equals("4568")) {
            puerto = puertoSqrt;
        }

        String url = "http://localhost:4568/"+servicio+"/"+numero ;
        System.out.println(url);
        URL url1 = new URL(url);
        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(url1.openStream()));
            String input;
            String outPut = "";

            while ((input = in.readLine()) != null){
                outPut += input;
            }
            System.out.println(outPut);
            return gson.toJson(outPut);

        }catch (Exception e){
            return "error en el get";
        }








    }


}
