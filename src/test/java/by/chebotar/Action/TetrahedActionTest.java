package by.chebotar.Action;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TetrahedActionTest{

  private TetrahedAction tetrahedAction = new TetrahedAction();

  @Test
  public void squareValueShouldBeNonNegative() throws IllegalArgumentException{
    Assert.assertEquals(tetrahedAction.square(-1), 0.0);
  }

  @Test
  public void volumeValueShouldBeNonNegative(){
    Assert.assertEquals(tetrahedAction.volume(-1), 0.0);
  }
}