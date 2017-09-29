package testDemo;
//商品
class Product {
	private int pid;
	private String pname;
	private double price;
	private Item item;
	private Subitem subitem;
	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem() {
		return this.item;
	}
	public void setSubitem(Subitem subitem) {
		this.subitem = subitem;
	}
	public Subitem getSubitem() {
		return this.subitem;
	}
	public String getInfo() {
		return "商品编号 : " + this.pid + ", 商品名称 : " + this.pname + ", 商品价格 ： " + this.price;
	}
}
