import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {


    public BetterRectangle(){

        super();
    }

    public BetterRectangle(int x, int y, int width, int height){

        super(x, y, width, height);
    }

    public int getPerimeter(){

        return (width * 2) + (height * 2);
    }

    public int getArea(){

        return width * height;
    }
}
