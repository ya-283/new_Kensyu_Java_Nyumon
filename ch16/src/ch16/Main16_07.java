package ch16;

import java.util.HashMap;
import java.util.Map;

public class Main16_07 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 239);
		prefs.put("東京都", 1328);
		prefs.put("熊本県", 169);
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "人口は約" + value + "万人");
		}
	}
}
