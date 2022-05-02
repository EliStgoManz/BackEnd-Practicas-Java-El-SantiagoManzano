package semana1.viernes;

public class bike {
    private int velocidad;
    private String color,marca;

    /*Declaramos el constructor vacio*/


    /*Aqui ya estamos sobrecargando un metodo*/
    public bike(int velocidad){
        this.velocidad=velocidad;
    }

    /*segunda sobrecarga de metodo*/
    public bike(int velocidad,String color){
        this.velocidad=velocidad;
        this.color=color;


    }

    public bike(int velocidad,String color,String marca){
        this.velocidad=velocidad;
        this.color=color;
        this.marca=marca;
    }

    public int getVelocidad(){return velocidad;}
    public String getColor(){return color;}
    public String getMarca(){return marca;}




}
