package testDemo;

import org.junit.Assert;
import org.junit.Test;

public class testDemo3 {
	
	//��Junit���Է���
	@Test
	public void testgetItem() {
		Subitem sit = new Subitem(0, null, null);
		sit.getItem();
		System.out.println("Item OK");
		//����-Assert.
		//��-���Է�������ֵ
		Assert.assertEquals(null, sit.getItem());
	}
}
