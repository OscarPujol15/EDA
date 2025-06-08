package exercicis.ex_01_Majuscules_Consola;

import java.io.*;
import classes.Teclat;

public class ToUpper_Console {

    public static void main (String [] args) {
        String filename;
        File file;
        BufferedReader entrada = null;
        String linia;

        System.out.print("Nom de l'arxiu (sense extensio): ");
        filename = Teclat.llegirCadena();
        filename = filename+".txt";

        // vincular i obrir
        file = new File(filename);
        try {
            BufferedReader entrada = new BufferedReader (new fileReader file);
            /* COMPLETAR */

        }
        catch (FileNotFoundException e) {
            System.out.print ("No s'ha trobat el fitxer");
            e.printStackTrace();

        }

        // llegir i mostrar en maj�scules
        System.out.println();
        System.out.println("--------------------------------------------------");
        try {
            do{
                entrada = linia.readLine();
                if (linia != null){
                    if (linia == "")
                        System.out.print("-------------------");
                    else{
                        System.out.print(linia);
                        Sytem.out.print("=>");
                        Sys0tem.out.print(linia.ToUpperCase());
                    }
                }
                
            } while (linia != null)
           /* COMPLETAR */
            // Versió amb un MENTRE (habitual)
           entrada.close();
        }
        catch (IOException e) {
           /* COMPLETAR */
        System.out.print("S'ha acabat el fitxer");
        e.printStackTrace();
        System.exit(0);

        }
        System.out.println("--------------------------------------------------");
    }

}
