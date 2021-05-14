package java_20210514;

import java.util.ArrayList;

class Product {
	private int number;
	private String name;
	private double price;
	
	Product() {
		super();
	}
	
	Product(int number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
} // product

public class ListDemo {
	
	public static Product selectByNumber() {
		return new Product(1, "신발", 100000);
	}
	
	public static ArrayList select() {
		ArrayList list = new ArrayList();
		
		list.add(new Product(2, "라면", 1000));
		list.add(new Product(3, "계란", 5000));
		list.add(new Product(4, "우유", 6000));
		list.add(new Product(5, "요플레", 1500));
		
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("111");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Product pro = selectByNumber();
		System.out.printf("%d %s %.0f\n",
				pro.getNumber(), pro.getName(), pro.getPrice());
		
		ArrayList list2 = select();
		for (int i = 0; i < list2.size(); i++) {
			Product temp = (Product)list2.get(i);
			System.out.printf("%d %s %.0f\n",
					temp.getNumber(), temp.getName(), temp.getPrice());
			
		}
		
	} // main
} // class
