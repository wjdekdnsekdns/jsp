package ch01;

public class MainTest1 {

	public static void main(String[] args) {

			Integer num = new Integer(20); // 박싱
			//int n = num; // 자동 언박싱(오토박싱)
			int n = num.intValue(); // 언 박싱
			System.out.println("n  : " + n);
			System.out.println("----------------");
			
			Integer num2 = 30; // 자동 박싱
			int result = num2;// 자동 언박싱
			System.out.println("result : " + result);
	}

}
