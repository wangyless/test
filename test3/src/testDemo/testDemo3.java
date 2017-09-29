package testDemo;

import org.junit.Assert;
import org.junit.Test;

public class testDemo3 {
	
	//用Junit测试方法
	@Test
	public void testgetItem() {
		Subitem sit = new Subitem(0, null, null);
		sit.getItem();
		System.out.println("Item OK");
		//断言-Assert.
		//例-测试方法返回值
		Assert.assertEquals(null, sit.getItem());
	}
}
