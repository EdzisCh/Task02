package by.chebotar.Entity;

import by.chebotar.Input.ParametrsHandler;
import java.io.FileNotFoundException;

public class TetrahedFactory extends ShapeFactory {

  private ParametrsHandler parametrsHandler;

  public TetrahedFactory() throws FileNotFoundException {
    parametrsHandler = new ParametrsHandler();
  }

  @Override
  public Shape getShape() {
    Shape shape;
    double[] parametrs;
    do{
      parametrs = parametrsHandler.getParametrs();
    }while(parametrs == null);
    return new Tetrahed(parametrs[0],new Point(parametrs[1]),new Point(parametrs[2]));
  }
}
