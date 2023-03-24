package ch02;

public class lamEx {
	public static void main(String[] args) {

		Ilam ilam = new Ilam() {
			
			@Override
			public int getMax(int a, int b) {
				if(a > b) {
					return a;
				}
				return b;
			}
		};
		Ilam ilam2 = (x, y) -> {return x > y ? x : y;};
		Ilam ilam3 = (x, y) ->  x > y ? x : y;
		System.out.println(ilam3.getMax(10, 20));
	}
}
interface Ilam{
	int getMax(int a, int b);
}