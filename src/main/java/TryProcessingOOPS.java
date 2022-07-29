import processing.core.PApplet;

public class TryProcessingOOPS extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    Circle circle1, circle2, circle3, circle4;

    public static void main(String[] args) {
        PApplet.main("TryProcessing" , args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        circle1 = new Circle(0, HEIGHT / 5, 1);
        circle2 = new Circle(0,  HEIGHT * 2 / 5, 2);
        circle3 = new Circle(0,  HEIGHT * 3 / 5, 3);
        circle4 = new Circle(0,  HEIGHT * 4 / 5, 4);
    }

    @Override
    public void draw() {
        drawCircle(circle1);
        drawCircle(circle2);
        drawCircle(circle3);
        drawCircle(circle4);
    }
    void drawCircle(Circle circle) {
        ellipse(circle.positionX, circle.positionY, DIAMETER, DIAMETER);
        circle.positionX += circle.speed;
    }
}
class Circle extends PApplet{
    int positionX;
    int positionY;
    int speed;

    public Circle(int positionX, int positionY, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }
}
