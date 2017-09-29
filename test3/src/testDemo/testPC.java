package testDemo;
//可以通过一个类型找到它所对应的全部子类型
//可以通过一个类型找到它所对应的全部商品，以及每个商品对应的子类型
//可以通过一个子类型找到它所对应的全部商品
public class testPC {
	public static void main(String args []) {
		//设置独立对象
		Item it = new Item(1, "露营装备", "户外");
		Subitem sit1 = new Subitem(1, "登山装备", "登山");
		Subitem sit2 = new Subitem(2, "海滩装备", "海滩");
		Product pro1 = new Product(1, "登山杖", 99.9);
		Product pro2 = new Product(2, "登山靴", 166.9);
		Product pro3 = new Product(3, "帐篷", 135.9);
		Product pro4 = new Product(4, "冲浪板", 71.9);
		//设置关系
		//1.通过一个子类型找到所对应的类型
		sit1.setItem(it);
		sit2.setItem(it);
		//2.通过一个子类型找到对应的全部商品
		pro1.setSubitem(sit1);
		pro2.setSubitem(sit1);
		pro3.setSubitem(sit2);
		pro4.setSubitem(sit2);
		//3.通过一个类型找到它所对应的全部子类型
		it.setSubitems(new Subitem[]{sit1, sit2});
		//4.通过一个类型找到它所对应的全部商品
		it.setProducts(new Product[]{pro1, pro2, pro3, pro4});
		//5.通过一个子类型找到它所对应的全部商品
		sit1.setProducts(new Product[] {pro1, pro2});
		sit2.setProducts(new Product[] {pro3, pro4});
		//6.通过商品找到它对应的类型
		pro1.setItem(it);
		pro2.setItem(it);
		pro3.setItem(it);
		pro4.setItem(it);
		//取出关系数据
		//1.通过一个类型找到它对应的全部子类型
		System.out.println("|-" + it.getInfo());
		for(int x = 0; x < it.getSubitems().length; x++) {
			System.out.println("\t|-" + it.getSubitems()[x].getInfo());
		}
		System.out.println("--------------------");
		//2.通过一个类型找到它所对应的全部商品，以及每个商品对应的子类型
		System.out.println("|-" + it.getInfo());
		for(int x = 0; x < it.getProducts().length; x++) {
			System.out.println("\t|-" + it.getProducts()[x].getInfo());
			System.out.println("\t\t|-" + it.getProducts()[x].getSubitem().getInfo());
		}
		System.out.println("--------------------");
		//3.通过一个子类型找到它所对应的全部商品
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
