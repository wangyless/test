package testDemo;
//子栏目
class Subitem {
	private int sid;
	private String sname;
	private String snote;
	private Product products[];
	private Item item;
	public Subitem(int sid, String sname, String snote) {
		this.sid = sid;
		this.sname = sname;
		this.snote = snote;
	}
	public void setProducts(Product products[]) {
		this.products = products;
	}
	public Product[] getProducts() {
		return this.products;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem() {
		return this.item;
	}
	public String getInfo() {
		return "SubItem编号 ： " + this.sid + ", SubItem名称 ： " + this.sname + ", SubItem信息 : " + this.snote;
	}
}
