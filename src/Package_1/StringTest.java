package Package_1;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);			//false로 출력 된다(힙메모리에 저장되기 때문)
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);			//true로 출력 된다(상수 풀에 저장되기 때문)
	}

}
