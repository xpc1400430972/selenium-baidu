package dnayuanceshi01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;

public class sizeyunsuanng {
	sizeyunsuan Y=new sizeyunsuan();
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @DataProvider(name="abc")
  public Object[][] data(){
 	 return new Object[][] {{"20","40"},{"50","20"},{"60","30"}};
  }
  @Test(timeOut=2000,dataProvider="abc")
  public void Aadd(String test1,String test2) throws InterruptedException {
	  System.out.println(test1);
	  Thread.sleep(3000);
	  System.out.println(test2);
	  // Y.add(test1, test2);
  }

  @Test(dataProvider="abc")
  public void Ccheng(String test1,String test2) {
	  System.out.println(test1);
	  System.out.println(test2);
  }

  @Test(dataProvider="abc")
  public void Dchu(String test1,String test2) {
	  System.out.println(test1);
	  System.out.println(test2);
  }

  @Test(dataProvider="abc")
  public void Bjian(String test1,String test2) {
	  System.out.println(test1);
	  System.out.println(test2);
  }
}
