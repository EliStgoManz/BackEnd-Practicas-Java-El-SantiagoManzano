package semana1;

public class PruebaBicicleta {
    public static void main(String[]args){
        def();

    }

    public static void def(){
        bicileta bicicletaMontaña=new bicileta();//creamos un nuevo objeto de la clase bicicleta
        bicicletaMontaña.setColor("roja");
        bicicletaMontaña.setPins(6);
        bicicletaMontaña.setRodada(26);
        bicicletaMontaña.setVelocidad(13.2);
        String msg="soy una bici de montaña con estas caracteristicas: ";
        msg+="\nColor: "+ bicicletaMontaña.getColor();
        msg+="\nVelocidad: "+bicicletaMontaña.getVelocidad();
        msg+="\nPins: "+bicicletaMontaña.getPins();
        msg+="\nPins: "+bicicletaMontaña.getRodada();

        System.out.print(msg);
    }




}
