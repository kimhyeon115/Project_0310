package Package_1;
class Person{}
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Person person = new Person();
		Class pClass1 = person.getClass();	//getClass는 Object 것이므로 사용할수 있다
		//getClass가 하는 일은 Class Class를 반환해 주는 일을 한다
		//getClass를 이용해서 Class Class를 가져 오려고 한다
		System.out.println(pClass1.getName());	//package_1.person이 출력된다
		//getName()이 package_1 패키지에 있는 person 클래스를 가져와서 출력한 것이다		
		Class pClass2 = person.getClass();
		System.out.println(pClass2.getName());	//위와 같이 나온다
		//getName()이 package_1 피키지에 있는 person 클래스를 가져와서 출력한 것이다
		Class pClass3 = Class.forName("Package_1.Person");
		//밑줄 오류시 add throws declaration을 해 주어라
		//forName("package_1.Person") package_1에 있는
		//Person 클래스를 가져와서 pClass3에 넣어라는 것
		System.out.println(pClass3.getName());	//package_1.Person이 출력된다
		//위화 같이 class를 가져오는 방법 3가지를 소개 했다
		Class pClass4 = Class.forName("java.lang.String");
		//Class.forName("java.lang.String");는 java.lang.String의
		//내용을 가진 클래스가 있으면 가지고 온다
		System.out.println(pClass4.getName());
	}

}
