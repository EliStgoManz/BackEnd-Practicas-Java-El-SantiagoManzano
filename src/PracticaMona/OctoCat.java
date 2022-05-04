package PracticaMona;

class OctoCat {
    //Definición de atributos de autocat
     int id;
     String nombre;

    /*realizamos sobrecarga de constructor*/
    OctoCat(int id,String nombre){
         this.id=id;
         this.nombre=nombre;

    }
}


class CatPersonaje extends OctoCat{
     private String habilidad;
     private String trajeEspacial;

     CatPersonaje(int id,String nombre,String habilidad,String trajeEspacial){
                 super(id,nombre);
                 this.habilidad=habilidad;
                 this.trajeEspacial=trajeEspacial;

     }

     //metodo para mostrar los atributos
    public void display(){
        System.out.println(id+" "+nombre+" "+habilidad+" "+trajeEspacial);
    }





}

/* creamos una clase de prueba*/
class TestOctoCat{
    public static void main(String[] args) {
        CatPersonaje catEspacial=new CatPersonaje(1,"OctoCat espacial","maneja naves espaciales hacia la galaxia","vaquero galactico");
        CatPersonaje catSorfista=new  CatPersonaje(2,"Octocat surfista","su habilidad es surfear las mejores olas de puerto escondido Oaxaca","sorfista nautico");
        CatPersonaje catExplorador=new CatPersonaje(3,"Octocat explorador","su habilidad es explorar todas la ruinas mágicas en México","Explorador de catacumbas");
        CatPersonaje catProgramador=new CatPersonaje(4,"octocat developer","es el mejor gato de su especie programando apps","traje devoloper espacial");
        catEspacial.display();
        catSorfista.display();
        catExplorador.display();
        catProgramador.display();

    }
}
