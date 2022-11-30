import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PonyExpressTest {

	PonyExpress p=new PonyExpress();
	@Test
	public void test1() {
		Assert.assertEquals(1, p.jinetes(new int[] { 18, 15 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, p.jinetes(new int[] { 43, 23, 40, 13 }));
	}

	@Test
	public void test3() {
		Assert.assertEquals(3, p.jinetes(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
	}

	@Test
	public void test4() {
		Assert.assertEquals(3, p.jinetes(new int[] { 51, 51, 51 }));
	}

	@Test
	public void test5() {
		Assert.assertEquals(4, p.jinetes(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

	
}
