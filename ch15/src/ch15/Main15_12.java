package ch15;

// code15_12 6つのint値とDate型の相互変換
import java.util.Calendar;
import java.util.Date;

public class Main15_12 {
	public static void mmain(String[] args) {
		Calendar c = Calendar.getInstance();
		// 6つのint値からDateインスタンスを生成
		c.set(2026, 6, 21, 9, 0, 0);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		// Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}
}
