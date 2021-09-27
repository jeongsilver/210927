package co.micol.prj;

import co.micol.prj.member.ForTest;
import co.micol.prj.member.Member;

public class MainApp {

	public static void main(String[] args) {
//		System.out.println("------Calculator-------");
//		Calculator calculator = new Calculator(); // 생성, Instance 만들자
//		calculator.setFirstNum(200); // setter를 통해 값을 전달한다
//		calculator.setSecondNum(20);
//		int sum = calculator.sum();
//		int sub = calculator.sub();
//
//		System.out.println("덧셈의 결과 = " + sum);
//		System.out.println("뺄셈의 결과 = " + sub);
//
//		calculator.setFirstNum(200);
//		calculator.setSecondNum(500);
//		System.out.println("전달된 두 수의 합 = " + calculator.sum());
//
//		// 생성자를 통해 값을 전달 받음
//		Calculator calculator1 = new Calculator(20, 20);
//		int sum1 = calculator1.sum();
//		int sub1 = calculator1.sub();
//		System.out.println("덧셈의 결과 = " + sum1);
//		System.out.println("뺄셈의 결과 = " + sub1);
//
//		System.out.println("-------MyCalculator-------");
//		MyCalculator myCalculator = new MyCalculator();
//		myCalculator.sum(10, 10); // void
//		float f = myCalculator.sum(5.0f, 5); // float
//		// function type 내가 어떤 일을 수행해서 결과를 돌려줘야함.
//		System.out.println(f);
//
//		int n = myCalculator.sum(5);
//		System.out.println(n);
//
//		double d = myCalculator.sum(10, 10.1);
//		System.out.println(d);
//
//		double d2 = (double) myCalculator.sum(10, 100);
//		// void 타입이면 강제 형변환 불가능
//
//		System.out.println("-------CompareMax---------");
//
//		CompareMax compareMax = new CompareMax(100, 50);
//		int max = compareMax.getMax();
//		System.out.println("두 수중에 큰 값은 = " + max);
//
//		System.out.println("-------Member---------");
//		Member member = new Member("hong", "1234", "홍길동", "대구광역시");
//		member.run();

		// 두 정수를 입력 받아서 n,m 두 정수의 합을 구하는 class 생성
		ForTest test= new ForTest();
		test.run();
	}

}
