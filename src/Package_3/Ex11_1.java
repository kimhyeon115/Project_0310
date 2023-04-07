package Package_3;
import java.util.*;
public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
//		List sub = list1.subList(1,4);				//읽기 밖에 안된다?
//		ArrayList list2 = new ArrayList(sub);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));	//list1의 배열에서 index 1의 자리부터
		print(list1, list2);									//index 4의 자리 이전까지 저장
		
		Collections.sort(list1);		//list1과 list2를 정렬한다
		Collections.sort(list2);		//Collections.sort(List 1)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		print(list1, list2);
		list2.add(3, "A");				//인덱스가 3인 곳에 "A"를 추가(add) 기존 데이터는 한칸씩 뒤로 밀림
		print(list1, list2);
		
		list2.set(3,  "AA");			//인덱스가 3인 곳에 "AA"로 변경(set)
		print(list1, list2);
										//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
		print(list1, list2);
										//list2에서 list1에 포함된 객체들을 삭제한다
		for(int i = list2.size()-1; i >=0; i--) {		//앞에서 부터 삭제시 index 번호가 바낀다 있다(자원 낭비)
			if(list1.contains(list2.get(i)))			//뒤에서 부터 삭제시 index에 영향 없음
				list2.remove(i);		//인덱스가 i인 곳에 저장된 요소를 삭제
		}
		print(list1, list2);
	}
		static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}
