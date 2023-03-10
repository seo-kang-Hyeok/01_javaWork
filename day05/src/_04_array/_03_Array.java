package _04_array;

public class _03_Array {

	public static void main(String[] args) {
		//가장 큰수와 작은 숫자.
		int[] arr1 = {39,4,29,67,19,95,75,37,68};
		
		int max = arr1[0]; 
		int min = arr1[0]; 
		
		for(int i = 1; i<arr1.length; i++) {
			if(max < arr1[i])
				max = arr1[i];
			
				
			if(min > arr1[i])
				min = arr1[i];
		} 
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		
	}

}
