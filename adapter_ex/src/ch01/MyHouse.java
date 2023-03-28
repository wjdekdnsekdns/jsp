package ch01;

public class MyHouse {

	public static void main(String[] args) {

		AirConditioner airConditioner = new AirConditioner();
		Cleaner cleaner = new Cleaner();
		HairDryer hairDryer = new HairDryer();
		Nintendo nintendo = new Nintendo();
		// 다형성
		connect(cleaner);
		connect(airConditioner);
		
		// 어댑터
		TencoAdapter adapterHairDryer = new TencoAdapter(hairDryer);
		connect(adapterHairDryer);
		
		TencoAdapter adapternintendo = new TencoAdapter(nintendo);
		connect(adapternintendo);
	}
	//MyHouse static
	// 전기 콘센트
	public static void connect(Electronic220v electronic220v) {
		electronic220v.connect();
	}
}// end of class
