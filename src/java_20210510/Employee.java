package java_20210510;

public class Employee extends Customer {
	private String zipcode;
	private String addr1;
	private String addr2;
	private String id;
	private String pwd;
	
	public Employee() {
		
	}
	
	public Employee(String zipcode, String addr1, String addr2,
					String id, String pwd, String name,
					String phone1, String phone2, String phone3) {
		this.zipcode = zipcode;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.id = id;
		this.pwd = pwd;
		this.name =name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
