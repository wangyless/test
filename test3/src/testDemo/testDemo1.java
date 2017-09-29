package testDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testDemo1 {
	
	private Item it;
	
	//Before用于在测试前初始化资源-针对每个单独的方法
		@Before
		public void before() {
			System.out.println("before");
			it = new Item(0, null, null);
		}
	//用Junit测试方法
	@Test
	public void testgetSubitem() {
		it.getSubitems();
		System.out.println("Item OK");
	}
	//用Junit测试方法
	@Test
	public void testgetProducts() {
		it.getProducts();
		System.out.println("Product OK");
	}
	//用Junit测试方法
	@Test
	public void testgetInfo() {
		Subitem sit = new Subitem(0, null, null);
		sit.getInfo();
		System.out.println("Subitem OK");
	}
	
	//After用来在测试完成后销毁资源-针对每个单独的方法
	@After
	public void after() {
		System.out.println("after");
	}
}
