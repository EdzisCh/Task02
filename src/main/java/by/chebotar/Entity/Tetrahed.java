package by.chebotar.Entity;

public class Tetrahed implements Shape {
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
}
