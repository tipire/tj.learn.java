package tj.learn.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

public class TestIO {
	public static void main(String[] args) throws IOException {
		/*InputStream in = System.in;
		int ch = 0;
		while((ch = in.read()) != -1) {
			System.out.println(ch);
		}*/
		String url = "http://m.sohu.com/a/%E5%9B%BE%E7%89%87%E5%90%AB%E6%9C%89%E4%BA%8C%E7%BB%B4%E7%A0%81";
		System.out.println(URLDecoder.decode("%20+%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20thumbnail%20+%20","utf-8"));
		System.out.println(URLDecoder.decode(url,"utf-8"));
		String url2 = "\u61c2\u5f97\u592a\u591a\uff0c\u770b\u5f97\u592a\u900f\uff0c\u6700\u5b64\u72ec";
		System.out.println(URLDecoder.decode(url2,"utf-8"));
	}
}
