package by.chebotar.Action;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TetrahedActionTest{

  private final TetrahedAction tetrahedAction = new TetrahedAction();

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void squareValueShouldBeNonNegative() throws IllegalArgumentException{
    Assert.assertEquals(tetrahedAction.square(-1), false);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void volumeValueShouldBeNonNegative() throws IllegalArgumentException{
    Assert.assertEquals(tetrahedAction.volume(-1), false);
  }
}