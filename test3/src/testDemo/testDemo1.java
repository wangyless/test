package testDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testDemo1 {
	
	private Item it;
	
	//Before�����ڲ���ǰ��ʼ����Դ-���ÿ�������ķ���
		@Before
		public void before() {
			System.out.println("before");
			it = new Item(0, null, null);
		}
	//��Junit���Է���
	@Test
	public void testgetSubitem() {
		it.getSubitems();
		System.out.println("Item OK");
	}
	//��Junit���Է���
	@Test
	public void testgetProducts() {
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
	
	//After�����ڲ�����ɺ�������Դ-���ÿ�������ķ���
	@After
	public void after() {
		System.out.println("after");
	}
}
