package ch18;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class Main18_03 {
	public static void main() throws Exception {
		URL u = new URI("https://sukkiri.jp/").toURL();
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = is.read();
		}
	}
}
