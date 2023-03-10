package _05_phone;

public class SmartPhone extends CellPhone{
	String talk;
	String search;
	
	public void talk(String talk) {
		this.talk = talk;
		System.out.println("카톡이 왔습니다. 카톡 내용 : " +talk);
	}
	public void search(String search) {
		this.search = search;
		System.out.println(search+" 검색을 시작합니다.");
		System.out.println(search+" 검색결과가 없습니다...");
	}
		


}
