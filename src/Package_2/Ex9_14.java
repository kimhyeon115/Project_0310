package Package_2;

import java.util.Scanner;

public class Ex9_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("국어?");
		int kor = Integer.parseInt(scn.next());
		System.out.println(kor);
//		Integer i = new Integer(100);
		Integer i = 100;
		Integer i2 = 100;
		
		System.out.println("i==i2 ? "+(i==i2));
		System.out.println("i.equals(i2)="+i.equals(i2));
		System.out.println("i.compareTo(i2)="+i.compareTo(i2));
		System.out.println("i.toString()="+i.toString());
		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE="+Integer.SIZE+" bits");
		System.out.println("BYTES="+Integer.BYTES+" bytes");
		System.out.println("TYPE="+Integer.TYPE);
	}

}
