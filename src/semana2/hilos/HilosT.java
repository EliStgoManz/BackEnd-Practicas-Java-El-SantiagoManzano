package semana2.hilos;

public class HilosT extends Thread{

    public void run(){//Runnable
        System.out.println("el hilo se esta ejecutando");
    }

    /*public void start(){
        //inicia la ejecución de un hilo
        //la JVM llamar al método run del hilo
    }*/

    /*
    sleep: detiene de manera temporal el numero especificado
    join(): lo que hace esperar al que el hilo muera, para entrar
    getPriority :Regresa la prioridad del hilo
    setPriority: establecer la prioridad del hilo
    getName: da el nombre del hilo
    currenThread: nos dice la referencia al hilo que se esta ejecutando
    getId: Regresa el ID del hilo
    Thread.state getState: regresa el estado actual de hilo.
    isAlive: el hilo sigue vivo.
    */

    /*
    public static void main(String[] args) {
        HilosT hilos=new HilosT();//aquí empezamos con el ciclo de vida del hilo
        hilos.start();//voy a inicializar el hilo

    }*/
}


class HilosR implements Runnable{

    public void run(){
        System.out.println("El hilo runable esta "+"corriendo");
    }

    public static void main(String[] args) {
        HilosR h=new HilosR();
        Thread t=new Thread(h);
        t.start();
    }
}


