package java_20210506.bb;
import java_20210506.aa.Notice;

public class NoticeDemo2 extends Notice {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 1; // public
		// n1.title = "공지사항"; // protected
		// n1.hit = 0; // default
		// n1.regdate = "2021-05-06"; // private
		
		NoticeDemo2 n2 = new NoticeDemo2();
		n2.number = 2; // public
		n2.title = "공지사항2"; // protected
		// n2.hit = 1; // default
		// n2.regdate = "2021-05-06"; // private
		
	}
}
