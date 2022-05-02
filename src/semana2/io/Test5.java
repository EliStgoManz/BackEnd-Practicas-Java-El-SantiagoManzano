package semana2.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {

    public static void main(String[] args) {
        try{
            FileOutputStream  fos=new FileOutputStream("C:\\magic.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fos);

            String s="Hola viajero galactico de innovacción Virtual";
            byte[]b=s.getBytes();

            bout.write(b);
            bout.flush();

            bout.close();
            fos.close();

            System.out.println("¡Listo");

        }catch(IOException ioe){
            ioe.printStackTrace();

        }

    }

}
