package dnayuanceshi01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class zhengchuTestng {
	zhengchu z=new zhengchu();
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void chu7() {
  z.chu7(22);
	  
  }
}
