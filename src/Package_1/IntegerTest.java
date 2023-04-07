package Package_1;

public class IntegerTest {

	public static void main(String[] args) {
		int s1 = 20;
		Integer s2 = 50;
		int ss = s1 + s2;
		System.out.println(ss);
		Integer i1 = new Integer(100);
		Integer i2 = 100;
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2;  //num1은 num.intValue()로 변환(언박싱)
		System.out.println(sum);
		Integer num3 = num2;	//num2는 Integer.valueOf(num2)로 변환(오토박싱)
		//Integer는 래퍼 클래스(wrapper class)라고
		//int Integer 클래스로 사용한다
		
		int a1 = 30;
		double a2 = 20.5;
		double ss1 = a1 + a2;
	}

}
