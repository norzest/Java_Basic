package java_20210506.aa;

public class Notice {
	public int number; // 서로 다른 패키지에서도 접근 가
	protected String title; // 서로 다른 패키지면서 상속받은 경우 접근 가능
	int hit; // 같은 패키지 내에서 접근 가능
	private String regdate; // 같은 클래스에서만 접근 가능
	
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 1; // public
		n1.title = "공지사항"; // protected
		n1.hit = 0; // default
		n1.regdate = "2021-05-06"; // private
	}
	
}
