package testDemo;
//����ͨ��һ�������ҵ�������Ӧ��ȫ��������
//����ͨ��һ�������ҵ�������Ӧ��ȫ����Ʒ���Լ�ÿ����Ʒ��Ӧ��������
//����ͨ��һ���������ҵ�������Ӧ��ȫ����Ʒ
public class testPC {
	public static void main(String args []) {
		//���ö�������
		Item it = new Item(1, "¶Ӫװ��", "����");
		Subitem sit1 = new Subitem(1, "��ɽװ��", "��ɽ");
		Subitem sit2 = new Subitem(2, "��̲װ��", "��̲");
		Product pro1 = new Product(1, "��ɽ��", 99.9);
		Product pro2 = new Product(2, "��ɽѥ", 166.9);
		Product pro3 = new Product(3, "����", 135.9);
		Product pro4 = new Product(4, "���˰�", 71.9);
		//���ù�ϵ
		//1.ͨ��һ���������ҵ�����Ӧ������
		sit1.setItem(it);
		sit2.setItem(it);
		//2.ͨ��һ���������ҵ���Ӧ��ȫ����Ʒ
		pro1.setSubitem(sit1);
		pro2.setSubitem(sit1);
		pro3.setSubitem(sit2);
		pro4.setSubitem(sit2);
		//3.ͨ��һ�������ҵ�������Ӧ��ȫ��������
		it.setSubitems(new Subitem[]{sit1, sit2});
		//4.ͨ��һ�������ҵ�������Ӧ��ȫ����Ʒ
		it.setProducts(new Product[]{pro1, pro2, pro3, pro4});
		//5.ͨ��һ���������ҵ�������Ӧ��ȫ����Ʒ
		sit1.setProducts(new Product[] {pro1, pro2});
		sit2.setProducts(new Product[] {pro3, pro4});
		//6.ͨ����Ʒ�ҵ�����Ӧ������
		pro1.setItem(it);
		pro2.setItem(it);
		pro3.setItem(it);
		pro4.setItem(it);
		//ȡ����ϵ����
		//1.ͨ��һ�������ҵ�����Ӧ��ȫ��������
		System.out.println("|-" + it.getInfo());
		for(int x = 0; x < it.getSubitems().length; x++) {
			System.out.println("\t|-" + it.getSubitems()[x].getInfo());
		}
		System.out.println("--------------------");
		//2.ͨ��һ�������ҵ�������Ӧ��ȫ����Ʒ���Լ�ÿ����Ʒ��Ӧ��������
		System.out.println("|-" + it.getInfo());
		for(int x = 0; x < it.getProducts().length; x++) {
			System.out.println("\t|-" + it.getProducts()[x].getInfo());
			System.out.println("\t\t|-" + it.getProducts()[x].getSubitem().getInfo());
		}
		System.out.println("--------------------");
		//3.ͨ��һ���������ҵ�������Ӧ��ȫ����Ʒ
		System.out.println("|-" + sit1.getInfo());
		for(int x = 0; x < sit1.getProducts().length; x++) {
			System.out.println("\t|-" + sit1.getProducts()[x].getInfo());
		}
		System.out.println("|-" + sit2.getInfo());
		for(int x = 0; x < sit2.getProducts().length; x++) {
			System.out.println("\t|-" + sit2.getProducts()[x].getInfo());
		}
	}
}
