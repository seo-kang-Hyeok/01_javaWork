package _04_tv;

public interface Searchable {
	void search(String msg);
	default void internet(String url) {
		
		
	}
}
