package Package_1;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		//내부적으로 가변적인 char[] 배열을 가지고 있는 클래스
		//문자열을 여러번 연결하거나 변경할떼 사용하면 유용함
		//매번 새로 생성하지 않고 기존 배열을 변경하므로 gabage가 생기지 않음
		//-StringBuffer는 멀티 쓰레드 프로그램에서 동기화(sybchronization)을 보장
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		//StringBuilder buffer 처럼 StringBuilder를 사용하면 append 후와 같은 위치의 값이 출력된다
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer)); //위와 같은 값이 출력된다
		
		String str2 = buffer.toString();
		System.out.println(str2);
		//스레드 동기화는 멀티스레드 환경에서 여러 스레드가 하나의 공유자원에 동시에 접근하지 못하도록
		//막는 것을 말한다. 공유데이터가 사용되어 동기화가 필요한 부분을 임계영역이라고 부르며 자바에서는
		//이 임계영역에 sychronized 키워드를 사용하여 여러 쓰레드가 동시에 접근하는 것을 금지함으로써
		//동기화를 할수 있게 된다
	}

}
