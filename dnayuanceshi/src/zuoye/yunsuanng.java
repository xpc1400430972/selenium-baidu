package zuoye;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;

public class yunsuanng {

 @DataProvider(name="add")
 public Object[][] data(){
	 return new Object[][] {{"20","40"},{"50","20"}};
 }
 @Test(dataProvider="add")
//@Parameters({"test1","test2"})
  public void f(String test1,String test2) {
	  System.out.println(test1);
	  System.out.println(test2);
  }
}
