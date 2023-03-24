package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		// 문자열 데이터 타입에서 기본 데이터 타입을 ㅗ변환 하는 방법을 알아야 한다
		// 래퍼클래스란 개념을 알고 있으면 된다
		
		String str = "127";
		String str2 = "10.5";
		String str3 = "true";
		
		byte b = Byte.parseByte(str); // 127 -128
		System.out.println("byte b : " + b);
		int i = Integer.parseInt(str);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(!bool);
		
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str);
		double d = Double.parseDouble(str2);
		
		System.out.println(l);
		System.out.println(d);
		System.out.println(d);
	}

}
