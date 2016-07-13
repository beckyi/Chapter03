package chapter03;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(10,20);
		Point p2 = new Point(50,100);
		Point p3 = p1;
		
		// Object의 기본 메서드 테스트
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());	//해싱 - 주소를 십진수로 바꾸어줌
		System.out.println(p1.toString());	// 16진수로 출력
		System.out.println(p1); // 16진수로 출력
		
		String s = new String("Hello");
		System.out.println(s.toString());	// (오버라이딩)해쉬값이 아닌 (내용)값이 출력
		
		// == -> 객체인 경우에는 동일한 객체 여부(동일성)
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		// equals -> 객체의 내용비교(동등성)
		Point p4 = new Point(10,20);
		
		System.out.println(p1 == p4);
		System.out.println(p1.equals(p4));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));	// 내용 비교
		
		//오버라이딩 하기 전 해쉬코드 번호 출력
		System.out.println(System.identityHashCode(p1));
	}

}
