package semana1y2;

import java.awt.*;

public class Game {
    public static void main(String[] args) {
        Screen screen=new Screen();
        Ashe ashe=new Ashe(01,
                " Ashe ",
                " Marksman ",
                " moderate ",
                " IceBorn warmother of the Avarosament ");

        ashe.frostShot(screen);
    }
}