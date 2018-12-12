package by.chebotar.Entity;

import by.chebotar.Input.ParametrsHandler;
import java.io.IOException;
import java.nio.file.Path;

public class TetrahedFactory extends ShapeFactory {

  private ParametrsHandler parametrsHandler = new ParametrsHandler();;

  public Tetrahed getTetrahed(Path path) throws IOException {
    double[] parametrs;
    do {
      parametrs = parametrsHandler.getParametrs(path);
    } while(parametrs == null);
    return new Tetrahed(parametrs[0],new Point(parametrs[1]),new Point(parametrs[2]));
  }
}
