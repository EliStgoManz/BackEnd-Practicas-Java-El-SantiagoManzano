package PracticaHarry;

public class PersonajeSagaHarryPotter {
    /*Declaramos atributos de los personajes
    de la saga de Harry potter*/
    private String nombre;
    private String apellidos;
    private int fechaNacimiento;
    private String poderes;

    /*declaramos los métodos setters y getters*/
    public String getNombre(){return nombre; }
    public String getApellidos(){return apellidos;}

    public int getFechaNacimiento(){return fechaNacimiento;}
    public String getPoderes(){return poderes;}

    //declaración de metodos set
    public boolean setNombre(String nombre){
        //verificamos si el atributo nombre no esta vacio
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }
    public boolean setApellidos(String apellidos){
        if(!apellidos.isEmpty()){
            this.apellidos=apellidos;
            return true;
        }else
            return false;
    }


    public boolean setFechaNacimiento(int fechaNacimiento){
        if(fechaNacimiento>0){
            this.fechaNacimiento=fechaNacimiento;
            return true;
        }else
            return false;
    }

    public boolean setPoderes(String poderes){
        if(!poderes.isEmpty()){
            this.poderes=poderes;
            return true;
        }else
            return false;
    }





}
