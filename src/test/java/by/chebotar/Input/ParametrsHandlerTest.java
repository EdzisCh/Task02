package by.chebotar.Input;

import by.chebotar.Exceptions.InvalidPathException;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParametrsHandlerTest {

  private ParametrsHandler parametrsHandler = new ParametrsHandler();
  @Test
  public void parametrsFromEmptyFileShouldBeZeros() throws InvalidPathException {
    double[] expectedParametrs = {0.0,0.0,0.0};
    Path pathToEmptyFile = Paths.get("src" + File.separator + "main" + File.separator + "resources" + File.separator + "empty.txt");
    Assert.assertEquals(parametrsHandler.getParametrs(pathToEmptyFile),expectedParametrs);
  }


}
