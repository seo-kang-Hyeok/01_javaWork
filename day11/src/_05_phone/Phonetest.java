package _05_phone;

public class PhoneTest {

	public static void main(String[] args) {
		Iphone Ip = new Iphone();
		Galaxy Gp = new Galaxy();
		System.out.println();
		
		Ip.bell();
		Ip.callOn();
		Ip.callOff();
		System.out.println();
		
		Gp.bell();
		Gp.callOn();
		Gp.callOff();
		System.out.println();
				
		Phone phone = Gp; //형변환가능. 
		phone.bell();
		phone.callOn();
		phone.callOff();
		System.out.println();
				
		phone = Ip; //형변환가능. 
		phone.bell();
		phone.callOn();
		phone.callOff();
		
		
		
	}
}