package co.micol.prj; //1
//Calculator -> MainApp -> MyCalculator-> CompareMain
public class Calculator { //Class 정의 , 만들자
	private int firstNum;
	private int secondNum;
	
	
	public Calculator() { //기본생성자
		
	}
	
	public Calculator(int n, int m){//1. 생성자 오버라이딩(다형성) / private 맴버변수를 생성자로 통해 받는 것
		this.firstNum=n;
		this.secondNum=m;
	}
	
	public Calculator(int n) {
		this.firstNum = n;
	}
	
	
	//
	
	public void setFirstNum(int n) { //setter
		this.firstNum = n;
	}
	
	
	public int getFirstNum() { //getter
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	
	public int sum() {
		return firstNum + secondNum;
	}
	
	
	public int sub() {
		return firstNum - secondNum;
	}
	
	
	
	
	
	
}
