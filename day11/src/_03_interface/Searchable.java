package _03_interface;

public interface Searchable {
	void search(String msg);
	default void internet(String url) {
		System.out.println("나중에 추가한 메서드");
		System.out.println("인터넷 보기");
	}
	static void sInter( ) {
		System.out.println("kkkk");
	}

}
