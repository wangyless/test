package testDemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testDemo2 {
	
	//Before用于在测试前初始化资源-针对类
		@BeforeClass
		public static void beforeClass() {
			System.out.println("beforeClass");
		}
	//用Junit测试方法
	@Test
	public void testgetSubitem() {
		Item it = new Item(0, null, null);
		it.getSubitems();
		System.out.println("Item OK");
	}
	//用Junit测试方法
	@Test
	public void testgetProducts() {
		Item it = new Item(0, null, null);
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
	
	//After用来在测试完成后销毁资源-针对类
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
}
