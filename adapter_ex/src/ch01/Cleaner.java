package ch01;

public class Cleaner implements Electronic220v{

	@Override
	public void connect() {

		System.out.println("청소기 연결 200v");
	}

	// 전기를 연결하다
}
