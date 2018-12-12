package by.chebotar.Entity;

import by.chebotar.Exceptions.InvalidPathException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TetrahedFactoryTest {

  private TetrahedFactory tetrahedFactory = new TetrahedFactory();

  @Test
  public void returnObjectShouldBeTetrahed() throws InvalidPathException {
    String validPath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "parametrs.txt";
    Tetrahed tetrahed = tetrahedFactory.getTetrahed(Paths.get(validPath));
    Assert.assertEquals(tetrahed.getClass(), Tetrahed.class);
  }

}
