package semana2.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:\\magia.txt");
            String s="Magia!!!";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("magia!!!");

        }catch(IOException ioe){
            ioe.printStackTrace();


        }
    }
}
