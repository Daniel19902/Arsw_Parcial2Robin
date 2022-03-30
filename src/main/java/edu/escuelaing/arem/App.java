package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
import java.net.MalformedURLException;

import static spark.Spark.*;
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        staticFiles.location("public");
        get("/:parametro/:numero", (req, res) -> robin(req.params(":parametro"), req.params(":numero")));
    }


    public static String robin(String parametro, String numero) throws MalformedURLException {
        System.out.println(parametro+ ""+numero);
        Robin robin = new Robin();
        return robin.calcular(parametro, numero);



    }



    public static int getPort(){

        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;

    }
}
