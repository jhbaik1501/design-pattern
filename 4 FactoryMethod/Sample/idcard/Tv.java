package idcard;

import framework.Product;

public class Tv extends Product {
	String name;
	String where;

	Tv(String name) {
		this.name = name;

		this.where = "LG";
	}
	@Override
	public void use() {
		System.out.println(name + "의 TV를 켭니다.");
		System.out.println("만들어진 위치" + where);
	}
}
