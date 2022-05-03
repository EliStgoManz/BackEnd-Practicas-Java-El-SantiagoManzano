package PracticaHarry;

public class TestPersonaje {
    public static void main(String[] args) {
              caracteristicasHarryPotter();
              caracteristicasRonald();
              caracteristicasHermione();
    }

    public static void caracteristicasHarryPotter(){
        PersonajeSagaHarryPotter harryPotter=new PersonajeSagaHarryPotter();
        harryPotter.setNombre("¡HOLA SOY HARRY JAMES!");
        harryPotter.setApellidos("ME APELLIDO: Potter Evans");
        harryPotter.setFechaNacimiento(1980);
        harryPotter.setPoderes("Harry tiene un don natural para defenderse de las artes oscuras. Ya desde su nacimiento, su madre le hizo un encantamiento que le protegió del mago tenebroso. Así que podría decirse que Harry Potter ha tenido la suerte siempre de cara.\n" +
                              " También ha demostrado ser más humano que cualquier otro, especialmente porque no puede controlar sus emociones,\n" +
                             " así que no domina la Oclumancia.");

        String msg="soy un personaje de la saga de harry Potter con las siguientes caracteristicas: ";
        msg+="\n Nombre: "+ harryPotter.getNombre();
        msg+="\n apellidos: "+harryPotter.getApellidos();
        msg+="\n fecha nacimiento: "+harryPotter.getFechaNacimiento();
        msg+="\n poderes: "+harryPotter.getPoderes();

        System.out.println(msg);
    }


    public static void caracteristicasRonald(){
        PersonajeSagaHarryPotter ronald=new PersonajeSagaHarryPotter();
        ronald.setNombre("¡HOLA SOY Ronald!");
        ronald.setApellidos("ME APELLIDO: Bilius Weasley");
        ronald.setFechaNacimiento(1980);
        ronald.setPoderes("Quidditch player\n, mago, estudiante\n, emprendedor y auror");

        String msg="soy un personaje de la saga de harry Potter con las siguientes caracteristicas: ";
        msg+="\n Nombre: "+ ronald.getNombre();
        msg+="\n apellidos: "+ronald.getApellidos();
        msg+="\n fecha nacimiento: "+ronald.getFechaNacimiento();
        msg+="\n poderes: "+ronald.getPoderes();

        System.out.println(msg);
    }

    public static void caracteristicasHermione (){
        PersonajeSagaHarryPotter hermione=new PersonajeSagaHarryPotter();
        hermione.setNombre("¡HOLA SOY HERMIONE!");
        hermione.setApellidos("ME APELLIDO: Jean Granger");
        hermione.setFechaNacimiento(1979);
        hermione.setPoderes("destacando especialmente en Defensa contra las Artes Oscuras.\n" +
                " Hermione también es muy buena en encantamientos y fue capaz de elaborar la poción Multijugos\n" +
                "en segundo año, entre muchos más conocimientos.");

        String msg="soy un personaje de la saga de harry Potter con las siguientes caracteristicas: ";
        msg+="\n Nombre: "+ hermione.getNombre();
        msg+="\n apellidos: "+hermione.getApellidos();
        msg+="\n fecha nacimiento: "+hermione.getFechaNacimiento();
        msg+="\n poderes: "+hermione.getPoderes();

        System.out.println(msg);
    }

}
