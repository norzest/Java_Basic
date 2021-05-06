package java_20210506.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 1; // public
		n1.title = "공지사항"; // protected
		n1.hit = 0; // default
		// n1.regdate = "2021-05-06"; // private
	}
}
