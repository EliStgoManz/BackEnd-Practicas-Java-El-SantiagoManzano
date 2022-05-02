package semana2;

abstract class Hola{
    void saludar(){
        //como lo hace
        System.out.println("¿como estas?");
    }

    abstract void saludo();
}

interface Mostrar{
    //que hace
    void show();
    abstract  void despide();
}

public class SaludosCordiales implements Mostrar{
    public void show(){
        System.out.println("Hola,¿como estas?, espero del todo bien");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1=new SaludosCordiales();
        saludo1.show();
    }

    public void despide(){
        System.out.println("gracias,hasta luego");
    }

}
