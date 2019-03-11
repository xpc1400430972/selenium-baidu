package dnayuanceshi01;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class class01Test {

	class01 y=new class01();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdd() {
		int result = y.add(1, 4);
		//╤оят
		assertEquals(5,result);
	}

	@Test
	public void testSub() {
		int result = y.sub(10, 3);
		assertEquals(7,result);
		
	}

	@Test
	public void testCheng() {
		int result = y.cheng(10, 10);
		assertEquals(100,result);
		
	}

	@Ignore
	public void testChu() {
		int result = y.chu(10, 0);
		assertEquals(7,result);
		
		}	
	
	}


