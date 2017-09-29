package testDemo;
//父栏目
class Item {
	private int iid;
	private String iname;
	private String inote;
	private Subitem subitems[];
	private Product products[];
	public Item(int iid, String iname, String inote) {
		this.iid = iid;
		this.iname = iname;
		this.inote = inote;
	}
	public void setSubitems(Subitem subitems[]) {
		this.subitems = subitems;
	}
	public Subitem[] getSubitems() {
		return this.subitems;
	}
	public void setProducts(Product products[]) {
		this.products = products;
	}
	public Product[] getProducts() {
		return this.products;
	}
	public String getInfo() {
		return "Item编号 ： " + this.iid + ", Item名称 ： " + this.iname + ", Item信息 ： " + this.inote;
	}
}
