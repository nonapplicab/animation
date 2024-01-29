import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public int x = 200;
    public int velocity = 1;
    public int theOtherOne = 1;
    public int y = 200;
    Ball myBall;
    public MyPanel(){
        myBall = new Ball(200,300);

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        myBall.draw(g);
        g.fillOval(x,y,25,25);
        //g.setColor(Color.BLUE);
        g.fillOval(490,550,40,40);
        //g.setColor(Color.cyan);
        g.fillOval(513,525,25,25);
        // calls paint component
        myBall.move();
        //x = x + velocity;
        if (x> getWidth()){
            velocity= -1*velocity;
        }
        y = y + theOtherOne;

        if (y> getHeight()){
            theOtherOne= -1*theOtherOne;
        }
        //y++;

        g.drawString("boom", 200,300);
        try {
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            System.out.println("do the thing");
        }
        repaint();
    }



}
