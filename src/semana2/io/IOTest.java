package semana2.io;


import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try{
            //escribiendo archivo
            FileOutputStream fos=new FileOutputStream("C:\\hola.txt");
            fos.write(65);//abriendo el flujo
            fos.close();

        }catch(IOException ioe){
            ioe.printStackTrace();

        }
    }
}
