package ch15;

// code15_11 現在日時を表示する
import java.util.Date;

public class Main15_11 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("現在日時は" + now);
		System.out.println("long値では" + now.getTime());
		now.setTime(178000000000L);
		System.out.println("指定日時は" + now);
	}
}
