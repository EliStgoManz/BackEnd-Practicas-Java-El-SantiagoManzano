package semana1.viernes;

class Animal{
    //caso1
    String color="Blanco";

    //caso 2
    void eat(){
        System.out.println("comiendo...");
    }


    //caso 3:constructor
    Animal(){
        System.out.println("se crea un animal");
    }
}

class Gato extends Animal{
    String color="Cafe";

    void printColor(){
        System.out.println("Color de la clase Gato:"+color);
        System.out.println("color de la clase Animal:"+super.color);
    }
    //metodo caso1
    void eat(){
        System.out.println("esta comiendo chuleta");
    }

    void dormir(){
        System.out.println("ya se durmio benito bodoke");
    }

    void call(){
        super.eat();
        dormir();
    }

    Gato(){
        super();
        System.out.println("se ha creado un gato...");
    }


}



public class superTest {
    public static void main(String[] args) {
        //caso1

        //new Gato().printColor();

        //caso2
        //new Gato().call();

        //caso 3
        new Gato();


    }

}
