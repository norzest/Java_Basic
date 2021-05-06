package java_20210506;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "심영효";
		c1.age = 26;
		c1.email = "dark1203@naver.com";
		c1.phone = "010-3367-9412";
		c1.balance = 1_000_000;
		c1.released = false;
		
		System.out.printf("%s %d %s %s %f %s\n",
				c1.name, c1.age, c1.email,
				c1.phone, c1.balance, c1.released);
		
		Customer c2 = new Customer();
		c2.name = "심일효";
		c2.age = 26;
		c2.email = "white1203@naver.com";
		c2.phone = "011-3367-9412";
		c2.balance = 2_000_000;
		c2.released = true;
		
		System.out.printf("%s %d %s %s %f %s\n",
				c2.name, c2.age, c2.email,
				c2.phone, c2.balance, c2.released);
		
		Customer.interest_rate = 6.2;
		
		System.out.printf("c1: %s, c2: %s\n",
				Customer.interest_rate, Customer.interest_rate);
		
	}

}
