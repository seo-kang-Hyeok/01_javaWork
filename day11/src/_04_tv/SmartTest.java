package _04_tv;

import _00_product.Tv;

public class SmartTest {

	public static void main(String[] args) {
		SmartTvclass tv = new SmartTvclass();
		tv.tvOn();
		tv.tvOff();
		tv.channel(9000);
		tv.search("하이");
	}

}
