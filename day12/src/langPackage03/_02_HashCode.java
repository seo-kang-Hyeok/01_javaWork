package langPackage03;

public class _02_HashCode {

	public static void main(String[] args) {
	String str1 = new String("abc");
	String str2 = new String("abc");
	
	System.out.println(str1.equals(str2));
	System.out.println(str1 == str2);
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	System.out.println(System.identityHashCode(str1)); //주소값으로 hashcoed를 만듦.
	System.out.println(System.identityHashCode(str2));

	
	
	}
}