package by.chebotar.Input;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParametrsReadTest {

  private final ParametrsRead parametrsRead = new ParametrsRead();

  @Test(expectedExceptions = IOException.class)
  public void validPathCheck() throws IOException {
    String validPath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "parametrs.txt";
    parametrsRead.getParametrs(Paths.get(validPath));
  }

  @Test
  public void nonValidPathCheck() throws IOException {
    String validPath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "parametrs.txt";
    parametrsRead.getParametrs(Paths.get(validPath));
  }
}
