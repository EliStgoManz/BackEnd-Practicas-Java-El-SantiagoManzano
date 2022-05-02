package semana2;

abstract class  Mountain{
    Mountain(){
        System.out.println("se ha creado una bicicleta de montaña");
    }
    abstract  void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("cambiando color a rojo");
    }
}

class Magistroni extends Mountain{
    void cambiarVelocidad(){
        System.out.println("se deben desbloquear las perillas del manubrio primero");
    }
}


public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1=new Magistroni();
        Bicicleta bici2=new Bicicleta();
        bici2.cambiarVelocidad();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
