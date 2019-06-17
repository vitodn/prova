package com.company;

public class FileReader {
import java.io.;
import java.net.;

    // definiamo la classe principale
    public class FileReader
    {
        public static void main(String[] args)
        {
            // definiamo il percorso al file da leggere
            File doc=new File("C:/doc.txt");
            URL path=null;

            // creaiamo un blocco try-catch per intercettare le eccezioni
            try
            {
                // mostriamo il percorso al file
                path=doc.toURL();
                System.out.println("Il doc si trova nel percorso" + path);

      / /mostriamo il nome del file
                    doc=new File(path.getFile());
                System.out.println("Nome del file " + doc);
                int i;

                // apriamo lo stream di input...
                InputStream is=path.openStream();
                BufferedReader br=new BufferedReader(new InputStreamReader(is));

                // avvio della lettura del file con un ciclo
                do
                {
                    i=br.read();
                    System.out.println((char)i);
                }
                while (i!=-1);
                is.close();
            }

            // intercettiamo eventuali eccezioni
            catch (URLException e)
            {
                System.out.println("Attenzione:" + e);
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
