package testDemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testDemo2 {
	
	//Before�����ڲ���ǰ��ʼ����Դ-�����
		@BeforeClass
		public static void beforeClass() {
			System.out.println("beforeClass");
		}
	//��Junit���Է���
	@Test
	public void testgetSubitem() {
		Item it = new Item(0, null, null);
		it.getSubitems();
		System.out.println("Item OK");
	}
	//��Junit���Է���
	@Test
	public void testgetProducts() {
		Item it = new Item(0, null, null);
		it.getProducts();
		System.out.println("Product OK");
	}
	//��Junit���Է���
	@Test
	public void testgetInfo() {
		Subitem sit = new Subitem(0, null, null);
		sit.getInfo();
		System.out.println("Subitem OK");
	}
	
	//After�����ڲ�����ɺ�������Դ-�����
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
}
