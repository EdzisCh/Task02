package by.chebotar.Entity;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TetrahedFactoryTest {

  private final TetrahedFactory tetrahedFactory = new TetrahedFactory();

  @Test
  public void returnObjectShouldBeTetrahed() throws IOException {
    Assert.assertEquals(tetrahedFactory.getShape(),Tetrahed.class);
  }

}
