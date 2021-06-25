package java_20210512;

class Test {
	String name;
	
	Test(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() { return name; }
}

public class ObjectDemo {
	public static void main(String[] args) {
		Test t1 = new Test("asd");
		Test t2 = new Test("asd");
		System.out.println(t1==t2); // 주소가 달라 false
		System.out.println(t1.equals(t2)); // 같은 오브젝트를 참조하여 주소가 같아짐
		// equals 함수를 override할때 hashcode 또한 override 되어 같아짐
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

		System.out.println(t1); // override

	}
}
