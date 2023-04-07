package Package_3;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("========함수를 사용=======");
		for(int i=0; i<list.size(); i++) {		//함수를 사용하는 경유
			System.out.println(list.get(i));
		}
		System.out.println("====함수를 사용하지 않을 경우====");
			String[] slist = new String[10];
			for(int i=0; i<slist.length; i++) {
				System.out.println(slist[i]);
			}
	}

}
