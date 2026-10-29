package ch16;

import java.util.HashMap;
import java.util.Map;

public class Main16_06 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 239);
		prefs.put("東京都", 1328);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は約" + tokyo + "万人");
		prefs.remove("東京都");
		prefs.put("熊本県", 169);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は約" + kumamoto + "万人");
	}
}