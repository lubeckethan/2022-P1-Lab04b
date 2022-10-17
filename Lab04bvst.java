// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
    g.drawRect(25,25,250,250);
    g.drawRect(125,125,250,250);

    g.drawLine(25,25,125,125);
    g.drawLine(275,25,375,125);
    g.drawLine(25,275,125,375);
    g.drawLine(275,275,375,375);





        // DRAW SPHERE
    g.drawOval(75,75,250,250);
    g.drawOval(112,75,175,250);
    g.drawOval(150,75,100,250);
    g.drawOval(187,75,25,250);

    g.drawOval(75,75,250,250);
    g.drawOval(75,112,250,175);
    g.drawOval(75,150,250,100);
    g.drawOval(75,187,250,25);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

    g.drawOval(700,350,250,250);
    g.drawLine(700,475,825,600);
    g.drawLine(825,600,920,395);
    g.drawLine(700,475,920,395);
    g.drawOval(748,440,118,118);


        // DRAW APCS
    g.fillRect(75,425,25,175);
    g.fillRect(75,425,100,25);
    g.fillRect(150,425,25,175);
    g.fillRect(100,500,50,25);

    g.fillRect(200,425,25,175);
    g.fillRect(200,425,100,25);
    g.fillRect(200,500,100,25);
    g.fillRect(275,425,25,100);

    g.fillRect(325,425,25,175);
    g.fillRect(325,425,100,25);
    g.fillRect(325,575,100,25);

    g.fillRect(450,425,100,25);
    g.fillRect(450,425,25,100);
    g.fillRect(450,500,100,25);
    g.fillRect(525,500,25,100);
    g.fillRect(450,575,100,25);


        // DRAW PACMEN FLOWER

        g.fillArc(700,50,100,100,45,-270);
        g.fillArc(765,115,100,100,45,270);
        g.fillArc(635,115,100,100,-135,270);
        g.fillArc(700,180,100,100,-45,270);



    }

}


