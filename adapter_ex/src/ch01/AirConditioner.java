package ch01;

public class AirConditioner implements Electronic220v{

	@Override
	public void connect() {

		System.out.println("에어콘 연결 220v On");
	}

	// 전기를 연결하다
}
