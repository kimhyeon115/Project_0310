package Package_2;
import static java.lang.Math.*;
import static java.lang.System.*;
public class Ex9_12 {

	public static void main(String[] args) {
		double val = 90.7552;
		out.println("round(" + val + ")=" + round(val));
		val *=100;
		out.println("round(" + val +")=" + round(val));
		
		out.println("round(" + val +")/100 =" + round(val)/100);
		out.println("round(" + val +")/100.0 =" + round(val)/100.0);
		out.println();
		out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));
	}

}
