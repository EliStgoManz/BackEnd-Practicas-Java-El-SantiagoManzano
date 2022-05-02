package semana1.viernes;

//declaración de la clase persona
class Persona {
//definición los atributos
int id;
String nombre;

//definición de constructor y sus paramétros
Persona(int id,String nombre){
    this.id=id;
    this.nombre=nombre;
}
}

/*Aplicamos herencia recodemos que nos sirve para extender
 o especializar las caracteristicas de una clase base, extendiendo dichas características
  a las clases derivadas; nuestra clase base es la Persona
  mientras que la clase que derica es el empleado*/

public class Emp extends Persona{
     double salario;//atributo del objeto persona

    //definimos en constructor
    Emp(int id,String nombre,double salario){
        /*Super: es una palabra reservada para hacer referencia; es un intermediario entre la clase padre, la clase hija
        Existe relación entre sus métodos y parametros*/
        super(id,nombre);
        this.salario=salario;
    }
    //creamos un metodo que muestra los atributos
     void display(){
        System.out.println(id+" "+nombre+" "+salario);
     }
}
//creamos una clase de prueba o un test
class TestPersonaEmpleado{
    public static void main(String[] args) {
        Emp e=new Emp(1,"Elí Manzano",3000.0);//instanciamos un objeto empleado
        e.display();//invocamos al metodo display,el cual muestra los atributos del emppleado
    }
}
