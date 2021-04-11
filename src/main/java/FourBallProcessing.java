import processing.core.PApplet;


class Ball{
    public int STEPS;
    public int xPosition;
    public float yPosition;
    public final int diameter=10;

    public Ball(int xPosition,float yPosition,int steps){
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.STEPS=steps;
    }
    public void draw(PApplet Applet){
        Applet.ellipse(this.xPosition,yPosition, diameter, diameter);
        this.xPosition+=this.STEPS;
    }
}

public class FourBallProcessing extends PApplet {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;
    Ball ball1=new Ball(0,HEIGHT * ((float)1/5),1);
    Ball ball2=new Ball(0,HEIGHT * ((float)2/5),2);
    Ball ball3=new Ball(0,HEIGHT * ((float)3/5),3);
    Ball ball4=new Ball(0,HEIGHT * ((float)4/5),4);
    public static void main(String[] args) {
        PApplet.main("FourBallProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ball1.draw(this);
        ball2.draw(this);
        ball3.draw(this);
        ball4.draw(this);
    }

}