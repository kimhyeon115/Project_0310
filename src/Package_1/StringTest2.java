package Package_1;

public class StringTest2 {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2);		//str1에 str2를 연결하여 하나로 만들어라
										//원래 str1은 "java"를 가리키는데 위와 같이 하면 "javaandroid"가 새로
										//만들어지면서 str1은 새로 만들어진 "javaandroid"를 가리키게 된다
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));  //위와 같은 명령인데 다른 값이 출력된다
	}

}
