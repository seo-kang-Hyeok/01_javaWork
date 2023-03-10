package _04_operator;

public class Operator {
	//오버로딩연습 변수의 갯수가 같고 자료형이 같으면 오버로딩x 갯수가 다르거나 자료형이 다르면 오버로딩
	int num1 = 1;
	int num2 = 1;
	
	int add() {						//매개변수x
		return num1+num2;
	}
	int add(int num1) {				//매개변수1개
		return num1+num2;
	}
	int add(int num1,int num2) {	//매개변수2개 
		return num1+num2;
	}
	double add(double num1) {		
		return num1+num2;
	}
	double add(double num1, double num2) {
		return num1+num2;
	}
	//빼기-----------------------------------------//
	int sybtract() {
		return num1-num2;
	}
	int sybtract(int num1) {
		return num1-num2;
	}
	int sybtract(int num1,int num2) {
		return num1-num2;
	}
	double sybtract(double num1) {		
		return num1-num2;
	}
	double sybtract(double num1, double num2) {
		return num1-num2;
	}
//나누기--------------------------------------------//	
	int divide() {
		return num1/num2;
	}
	int divide(int num1) {
		return num1/num2;
	}
	int divide(int num1,int num2) {
		return num1/num2;
	}
	double divide(double num1) {		
		return num1/num2;
	}
	double divide(double num1, double num2) {
		return num1/num2;
	}
//곱하기-----------------------------------------//
	int multoply() {
		return num1*num2;
	}
	int multoply(int num1) {
		return num1*num2;
	}
	int multoply(int num1,int num2) {
		return num1*num2;
	}
	double multoply(double num1) {		
		return num1*num2;
	}
	double multoply(double num1, double num2) {
		return num1*num2;
	}
	int add(int[] arrInt) { //배열 안의 모든 합을 구하기.
		int sum = 0; 
		for(int i=0; i<arrInt.length; i++) {
		sum += arrInt[i];
		}
		return sum;
	}
	
	
	

	
	}

