package by.chebotar.Entity;

public class Point {
  private double point;

  public Point(double point){
    this.point = point;
  }

  public double getPoint() {
    return point;
  }

  @Override
  public boolean equals(Object obj) {
    Point point = (Point) obj;
    if (obj == null){
      return false;
    } else if (this.getClass() != obj.getClass()){
      return false;
    } else if (this.point != point.getPoint()){
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    int temp = 5;
    return (int) (result*temp+point);
  }
}
