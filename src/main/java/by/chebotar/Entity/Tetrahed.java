package by.chebotar.Entity;

public class Tetrahed extends Shape {
  private Point x;
  private Point y;
  private double a;

  public Tetrahed(double a, Point x, Point y){
    this.a = a;
    this.x = x;
    this.y = y;
  }

  public double getA() {
    return a;
  }

  public Point getY() {
    return y;
  }

  public Point getX() {
    return x;
  }

  @Override
  public boolean equals(Object obj) {
    Tetrahed tetrahed = (Tetrahed) obj;
    if (obj == null){
      return false;
    } else if (this.getClass() != obj.getClass()){
      return false;
    } else if (this.a != tetrahed.getA() || this.y != tetrahed.getY() || this.x != tetrahed.getX()){
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    int temp = 5;
    return (int) (result*temp+a+x.getPoint()+y.getPoint());
  }
}
