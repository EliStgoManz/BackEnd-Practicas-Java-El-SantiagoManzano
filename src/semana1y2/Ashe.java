package semana1y2;


public class Ashe extends Champion implements AsheActionsCallbacks{


    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("asheCombat.gif");
        s.setBounds(200,100,1100,980);

        //System.out.println("Lanzo una flecha");
    }

    @Override
    public void hawShot(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("asheCombatTwo.gif");
        s.setBounds(200,100,1100,980);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("asheCombatThree.gif");
        s.setBounds(200,100,1100,980);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("asheCombatFour.gif");
        s.setBounds(200,100,1100,980);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("asheCombatFive.gif");
        s.setBounds(200,100,1100,980);

    }
}
