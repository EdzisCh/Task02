package by.chebotar.Input;

import by.chebotar.Exceptions.InvalidPathException;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.testng.annotations.Test;

public class ParametrsReadTest {

  private ParametrsRead parametrsRead = new ParametrsRead();

  @Test(expectedExceptions = InvalidPathException.class)
  public void parametrsReadShouldThrowInvalidPathException() throws InvalidPathException {
    Path invalidPath = Paths.get("bad" + File.separator + "path" + File.separator + "parametrs.txt");
    parametrsRead.getParametrs(invalidPath);
  }
}
