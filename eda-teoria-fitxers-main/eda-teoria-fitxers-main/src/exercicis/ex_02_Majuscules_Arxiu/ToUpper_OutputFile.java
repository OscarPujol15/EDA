package exercicis.ex_02_Majuscules_Arxiu;

import java.io.*;
import classes.Teclat;


public class ToUpper_OutputFile {

    public static void main (String [] args) throws IOException {
        String filename;
        File inputFile, outputFile; // un fitxer per l'entrada i un per la sortida
        BufferedReader entrada = null;
        BufferedWriter sortida = null;
        String linia;

        System.out.print("Nom de l'arxiu (sense extensió): ");
        filename = Teclat.llegirCadena();

        // Vincular i obrir tant l'entrada com la sortida
        inputFile = new File(filename+".txt");
        outputFile = new File(filename+"_UPPER.txt");

        /* COMPLETAR */
        try {
            entrada = new BufferedReader entrada (new fileReader (inputFile));
            sortida = new BufferedWriter sortida (new fileWriter (outputFile));
        }
        catch(FileNotFoundException e){
            System.out.print("Hi ha algun dels documents que no s'ha detectat correctament");
            system.exit(0);
        }
        }
        catch (IOException ex) {
            System.err.println("Problemes amb algun dels arxius!");
            ex.printStackTrace();
            System.exit(0);


        // llegir en un i escriure en l'altre
        try {
            do{
                linia = entrada.readLine();

                if (linia != null){
                    sortida.write(linia.ToUpperCase());
                    linia = entrada.readLine();
                }
                
            }while (linia !=null);
            
        }          
           /* COMPLETAR */
        	sortida.close();
            sortida.close();
        }
        catch (IOException ex) {
           /* COMPLETAR */
            System.out.print("El fitxer ha finalitzat");
            ex.printStackTrace();
            System.exit (0);

        }
        System.out.println(">>>Arxiu processat. Resultat a " + outputFile.getName());
    }
}
