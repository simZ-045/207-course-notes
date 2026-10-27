/**
 * A Rectangle class that has 2 variables height and width representing a real rectangle.
 * Have functions that outputs area, scale the rectangle,
 * or compare with another Rectangle instance.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Rectangle constructor.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   *
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * calculates the area and returns it.
   *
   * @return the area of the Rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor a double value that represents how much the rectangle is going to be scaled by.
   */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
   * compares 2 rectangles by area.
   *
   * @param other the other rectangle to be compared with.
   * @return if the current rectangle has a larger area than the given rectangle.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
