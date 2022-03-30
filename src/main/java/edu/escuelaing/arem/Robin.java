package edu.escuelaing.arem;

import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Robin {


    private String[] links = {"http://ec2-52-0-216-223.compute-1.amazonaws.com","http://ec2-user@ec2-3-84-53-107.compute-1.amazonaws.com" };
    private Gson gson = new Gson();
    private int puerto = 0;



    public String calcular(String servicio, String numero, int puerto) throws MalformedURLException {



        String url = links[puerto]+":4568/"+servicio+"/"+numero ;
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
