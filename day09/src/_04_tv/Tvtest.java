package _04_tv;

public class Tvtest {

	public static void main(String[] args) {
		SmartTv st1 = new SmartTv();
		st1.power();
		st1.channelUp();
		st1.search("java");
		st1.search("피지컬100");
		st1.power();
	}
}
