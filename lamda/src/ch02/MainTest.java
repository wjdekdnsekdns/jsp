package ch02;

public class MainTest {

	
	
	public static void main(String[] args) {

		IMaxNumber maxInt = new IMaxNumber() {
			@Override
			public int getMax(int a, int b) {
				if(a < b) {
					return a;
				}
				return b;
			}
		};
		IMaxNumber lambdaMaxInt = (x, y) -> {return x > y ? x : y;};
		
		System.out.println(lambdaMaxInt.getMax(50, 100));
		
	}// end of main

}
class MaxNumber implements IMaxNumber{

	@Override
	public int getMax(int a, int b) {
		
		return 0;
	}
	
}