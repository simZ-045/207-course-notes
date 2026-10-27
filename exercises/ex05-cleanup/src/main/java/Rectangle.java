/**
 * A Rectangle class that has 2 variables height and width representing a real rectangle
 * Have functions that outputs area, scale the rectangle, or compare with another Rectangle instance
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    /**
     *
     * @return the area of the Rectangle
     */
    public double area() {
        return width * height;
    }

    /**
     * scales the rectangle
     *
     * @param factor a double value that represents how much the rectangle is going to be scaled by
     */
    public void scale(double factor) {
      width *= factor;
      height *= factor;
    }

    public boolean isLargerThan(Rectangle other) {
        return area() > other.area();
    }
}
