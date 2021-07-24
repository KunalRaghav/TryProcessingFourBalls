import processing.core.PApplet;

public class MainWindow extends PApplet {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 540;
    public static final int Diameter = 20;
    public static int X_VAL_1 = 0;
    public static int X_VAL_2 = 0;
    public static int X_VAL_3 = 0;
    public static int X_VAL_4 = 0;

    public static void main(String[] args) {
        PApplet.main("MainWindow", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        paintCircleOne();
        paintCircleTwo();
        paintCircleThree();
        paintCircleFour();
    }

    private void paintCircleOne() {
        ellipse(X_VAL_1, HEIGHT/5f, Diameter, Diameter);
        X_VAL_1+=1;
    }

    private void paintCircleTwo() {
        ellipse(X_VAL_2, HEIGHT/5.0f*2, Diameter, Diameter);
        X_VAL_2+=2;
    }

    private void paintCircleThree() {
        ellipse(X_VAL_3, HEIGHT/5.0f*3, Diameter, Diameter);
        X_VAL_3+=3;
    }

    private void paintCircleFour() {
        ellipse(X_VAL_4, HEIGHT/5.0f*4, Diameter, Diameter);
        X_VAL_4+=4;
    }

}
