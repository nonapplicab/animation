import java.awt.*;

public class Ball {
    private int size;
    private Color coolor;
    private int velocity;
    private int xLocation;
    private int yLocation;
    public Ball (int x,int y){
        xLocation = (int)Math.random()*mypan;
        yLocation = y;
        size = 10;
        coolor = Color.BLUE;
        velocity = 10;
    }
    public void draw(Graphics g6){
        g6.setColor(coolor);
        g6.fillOval(xLocation,yLocation,size,size);
    }
    public void move(){
        xLocation+=velocity;
    }

}
