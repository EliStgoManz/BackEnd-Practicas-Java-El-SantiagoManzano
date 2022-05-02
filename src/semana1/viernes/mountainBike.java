package semana1.viernes;

public class mountainBike {
    public static void main(String[] args) {
          show();
    }

    public static void show(){
        bike b=new bike(6,"azul");
        System.out.println(b.getVelocidad());
        System.out.println(b.getColor());
    }
}
