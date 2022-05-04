package practicaMultiverse;


abstract class MordeduraAracnida{
    void mordedura(){
        //metodos abstractos ¿como lo hace?
        System.out.println("¿como es que una araña, pudo brindarte superpoderes?");
    }

    abstract void morder();


}
//¿que es lo que hace-interfaz

interface habilidadesAracnidas{
    void transformacion();
    abstract void poderAracnido();
}


public class SentidoAracnido implements habilidadesAracnidas{

    public void transformacion(){
        System.out.println("Adquiri las hábilidades aracnidas tras ser mordido por una araña\n" +
                "así que me converti en el nuevo heroe");
    }

    public static void main(String[] args) {
        SentidoAracnido petterParker=new SentidoAracnido();
        petterParker.transformacion();

    }

    public void poderAracnido(){
        System.out.println("El estudiante Peter Parker fue mordido por una araña radioactiva, lo que le dio habilidades como escalar por las paredes,\n" +
                " agilidad, un sentido arácnido que se activa ante el peligro y fuerza sobrehumana.\n" +
                " Tras la muerte de su tío Ben Parker, Peter aprende\n" +
                " que UN GRAN PODER CONLLEVA UNA GRAN RESPONSABILIDAD,\n" +
                " lo que le convierte en justiciero de Nueva York.\n" +
                "\n" +
                " ");
    }


}
