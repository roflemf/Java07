/* try~catch~finally문 실행순서
 * 
 * 문제)
 * 첫번쨰, catch블록에서는 ArithmeticException 예외로 처리하고 해당 블록문에서 instanceof 연산자를 사용해서 
 * 		 ae 매개변수가 해당 ArithmeticException타입으로 형변환이 가능한가?
 * 		 true가 나오게 해보자
 * 둘쨰, finally 블록에서는 Exception으로 처리해서 6을 출력해보자
 * 
 */
public class TryTest11 {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	
	try {
		System.out.println(3);
		System.out.println(10/0); // 예외 오류 발생
		System.out.println(4); // 이 문장 실행 안함
	} catch (ArithmeticException ae) {
		if(ae instanceof ArithmeticException) {
			System.out.println(true);
		}
	} finally {
		System.out.println(6);
	}
}
}
