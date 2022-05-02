package semana1.viernes;

class Bike2 {

    void run(){
        System.out.println("runinng...");
    }
}

   public class Polimorfismo extends Bike2{

    void run(){
        System.out.println("running safely 60mile per hour");
    }

       public static void main(String[] args) {
           Bike2 bike2=new Polimorfismo();
           bike2.run();
       }

}

