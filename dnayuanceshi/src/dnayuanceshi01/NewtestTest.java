package dnayuanceshi01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;

public class NewtestTest {
	Newtest y=new Newtest();
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void Upset() {
   int abc=y.Upset(12, 10);
   Assert.assertEquals(abc, 120);
  }
}
