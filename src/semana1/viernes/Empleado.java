package semana1.viernes;

public class Empleado {
    double salario=40000;
}

class Programador extends Empleado{
    int bono=10000;

    public void main(){
        Programador Eli=new Programador();
        System.out.println("El salario de programador es :"+Eli.salario);
        System.out.println("El bono de Programador es:"+ Eli.bono);
    }

    void mensaje(){
        System.out.println("Soy Programador");
        main();

    }
}

class Web extends Programador{
    public static void main(String[] args) {
        Web w=new Web();
        w.mensaje();
    }
}


