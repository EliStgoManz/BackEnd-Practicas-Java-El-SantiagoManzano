package semana2.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\hola.txt");
            int i=fis.read();
            System.out.println((char)i);//leer el archivo caracter por caracter
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
