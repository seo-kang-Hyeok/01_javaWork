package test02;

public class FusionData {
	//메서드
	void stuAdd() {
	Student[] fusionStudent = new Student[2];
	fusionStudent[0] = new Student("20230001", "홍길동", 98, "서울특별시", "010-1111-1111", true);
	fusionStudent[1] = new Student("20230002", "아무개", 56, "서울특별시", "010-1111-3333", false);
	
	for(int i = 0; i <fusionStudent.length; i++) {
		Student stu = fusionStudent[i];// 객체를 저장공간에 저장하고 싶다. 타입은 Student!로 만들었지?
		//System.out.println(stu); // 오버라이딩한 toString() 호출
		System.out.println(stu.getName()+"\t"+stu.getJumsu()+"\t"+stu.getTel()); //원하는 것만 추출하려면
		
	}
	/*
	 * System.out.println(fusionStudent[0].getStuNo());
	 * System.out.println(fusionStudent[0].getName()); //하나 하나 추출하기.
	 * 
	 * System.out.println(fusionStudent[0].toString());//toString오버라이딩을 해서 같은 값이
	 * 나온다. System.out.println(fusionStudent[0]); //toString오버라이딩을 해서 같은 값이 나온다.
	 * 
	 * System.out.println(fusionStudent[1]); //toString 한 것이 출력이 된다.
	 * 
	 *///라이브러리가 있으면 메서드 영역 인스턴스 영역.
	
	
	
	}
}
