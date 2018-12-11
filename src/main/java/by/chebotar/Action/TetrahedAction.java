package by.chebotar.Action;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TetrahedAction implements Action {

  private static final Logger LOGGER = LogManager.getLogger(TetrahedAction.class);

  public double square(double a) throws IllegalArgumentException {
    if (a < 0){
      LOGGER.error("Side of the tetrahed should be non-negative");
      throw new IllegalArgumentException();
    }
    return Math.pow(a,2)*1.732;
  }

  public double volume(double a) throws IllegalArgumentException {
    if (a < 0){
      LOGGER.error("Side of the tetrahed should be non-negative");
      throw new IllegalArgumentException();
    }
    return Math.pow(a,3)*1.732/12.0;
  }

  public double[] volumeRatio(double a, double k) {

    return null;
  }
}
