package by.chebotar.Action;

public class TetrahedAction implements Action {

  public double square(double a) {
    return Math.pow(a,2)*1.732;
  }

  public double volume(double a) {
    return Math.pow(a,3)*1.732/12.0;
  }

  public double[] volumeRatio(double a, double k) {

    return null;
  }
}
