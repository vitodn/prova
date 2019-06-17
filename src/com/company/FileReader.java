package com.company;

public class FileReader {
import java.io.;
import java.net.;


    public class FileReader
    {
        public static void main(String[] args)
        {

            File doc=new File("C:/doc.txt");
            URL path=null;


            try
            {

                path=doc.toURL();
                System.out.println("Il doc si trova nel percorso" + path);

      / /mostriamo il nome del file
                    doc=new File(path.getFile());
                System.out.println("Nome del file " + doc);
                int i;


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
