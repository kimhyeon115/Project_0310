package Package_1;
class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String toString() {
		return "책 이름은 " + title + "이고 " + "저자는 " + author + "입니다";
	}
	
}
public class ToStringEx {

	public static void main(String[] args) {
		Book book = new Book("자바","강수님");
		System.out.println(book); 
		String str = new String("test");			//최상위 클래스 object를 객체생성 사용
		System.out.println(str);
	}
}
