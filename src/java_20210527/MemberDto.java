package java_20210527;

// 1. member 테이블 객체화
// 이유 : 매개 변수를 줄이기 위해
// 테이블의 한개의 row 정보를 객체화 하기 위해
public class MemberDto {
	private int num;
	private String name;
	private String addr;
	
	public MemberDto() {
		super();
		this.num = 0;
		this.name = "";
		this.addr = "";
	}
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
