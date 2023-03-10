package _02_staticVari;

public class Product {
	static int count;  	//static 이 붙으면 공동으로 사용합니다.
	int proNo = 20230000; //붙지 않으면 인스턴트 변수입니다??
	
	Product() {			//new 마다 count ++! 
		++count;
		proNo += count;
	}
	
//	{
//		++count;
//		proNo = count;
//	}

}
