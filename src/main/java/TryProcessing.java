import processing.core.PApplet;

public class TryProcessing extends PApplet {
    int a;
    int b;
    int c;
    int d;
    public static void main(String[] args)
    {
        PApplet.main( "TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(650,500);
    }

    @Override
    public void setup() {
        ellipse(10, 10, 10, 10);

    }


    @Override
    public void draw() {
        //background(255);
        ellipse(a, 10, 10, 10);
        a++;
        ellipse(b, 100, 10, 10);
        b=b+2;
        ellipse(c, 200, 10, 10);
        c=c+3;
        ellipse(d, 300, 10, 10);
        d=d+4;
    }
}
